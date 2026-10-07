package com.pemmob.pipitanime.data.repository

import com.pemmob.pipitanime.data.model.Anime
import com.pemmob.pipitanime.data.model.Genre
import com.pemmob.pipitanime.data.remote.RetrofitInstance

class AnimeRepository {
    private val api = RetrofitInstance.api

    suspend fun searchAnime(query: String?, genreId: Int?): List<Anime> {
        val genreQuery = genreId?.toString()
        val response = api.searchAnime(query = query, genres = genreQuery)
        return response.data
    }

    suspend fun getAnimeDetail(id: Int): Anime {
        return api.getAnimeDetail(id).data
    }

    suspend fun getGenres(): List<Genre> {
        return api.getGenres().data
    }
}
