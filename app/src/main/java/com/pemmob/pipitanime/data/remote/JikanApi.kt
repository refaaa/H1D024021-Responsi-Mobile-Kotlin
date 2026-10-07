package com.pemmob.pipitanime.data.remote

import com.pemmob.pipitanime.data.model.AnimeDetailResponse
import com.pemmob.pipitanime.data.model.AnimeSearchResponse
import com.pemmob.pipitanime.data.model.GenreResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface JikanApi {
    @GET("anime")
    suspend fun searchAnime(
        @Query("q") query: String? = null,
        @Query("genres") genres: String? = null,
        @Query("sfw") sfw: Boolean = true
    ): AnimeSearchResponse

    @GET("anime/{id}")
    suspend fun getAnimeDetail(
        @Path("id") id: Int
    ): AnimeDetailResponse

    @GET("genres/anime")
    suspend fun getGenres(
        @Query("filter") filter: String = "genres"
    ): GenreResponse
}