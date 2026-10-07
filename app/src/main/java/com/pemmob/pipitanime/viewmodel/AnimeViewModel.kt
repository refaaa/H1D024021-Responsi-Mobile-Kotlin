package com.pemmob.pipitanime.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pemmob.pipitanime.data.model.Anime
import com.pemmob.pipitanime.data.model.Genre
import com.pemmob.pipitanime.data.repository.AnimeRepository
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

sealed class UiState<out T> {
    object Loading : UiState<Nothing>()
    data class Success<T>(val data: T) : UiState<T>()
    data class Error(val message: String) : UiState<Nothing>()
}

class AnimeViewModel : ViewModel() {
    private val repository = AnimeRepository()

    private val _searchQuery = MutableStateFlow("")
    val searchQuery = _searchQuery.asStateFlow()

    private val _selectedGenre = MutableStateFlow<Genre?>(null)
    val selectedGenre = _selectedGenre.asStateFlow()

    private val _genres = MutableStateFlow<List<Genre>>(emptyList())
    val genres = _genres.asStateFlow()

    private val _animeListState = MutableStateFlow<UiState<List<Anime>>>(UiState.Loading)
    val animeListState = _animeListState.asStateFlow()

    private val _animeDetailState = MutableStateFlow<UiState<Anime>>(UiState.Loading)
    val animeDetailState = _animeDetailState.asStateFlow()

    // Job untuk debounce: cancel request lama jika user masih mengetik
    private var searchJob: Job? = null

    init {
        fetchGenres()
        searchAnime()
    }

    private fun fetchGenres() {
        viewModelScope.launch {
            try {
                val genreList = repository.getGenres()
                _genres.value = genreList
            } catch (e: Exception) {
                // Abaikan error genre
            }
        }
    }

    fun onSearchQueryChanged(query: String) {
        _searchQuery.value = query
        // Debounce 600ms: tunggu user selesai mengetik sebelum kirim request
        searchJob?.cancel()
        searchJob = viewModelScope.launch {
            delay(600)
            searchAnime()
        }
    }

    fun onGenreSelected(genre: Genre?) {
        _selectedGenre.value = genre
        searchAnime()
    }

    fun searchAnime() {
        searchJob?.cancel()
        searchJob = viewModelScope.launch {
            _animeListState.value = UiState.Loading
            try {
                // trim() menghilangkan spasi berlebih, lowercase ditangani API
                val query = _searchQuery.value.trim().takeIf { it.isNotBlank() }
                val genreId = _selectedGenre.value?.malId
                val results = repository.searchAnime(query, genreId)
                _animeListState.value = UiState.Success(results)
            } catch (e: Exception) {
                _animeListState.value = UiState.Error(e.message ?: "Terjadi kesalahan")
            }
        }
    }

    fun getAnimeDetail(id: Int) {
        viewModelScope.launch {
            _animeDetailState.value = UiState.Loading
            try {
                val detail = repository.getAnimeDetail(id)
                _animeDetailState.value = UiState.Success(detail)
            } catch (e: Exception) {
                _animeDetailState.value = UiState.Error(e.message ?: "Terjadi kesalahan")
            }
        }
    }
}
