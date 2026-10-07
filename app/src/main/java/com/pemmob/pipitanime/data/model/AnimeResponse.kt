package com.pemmob.pipitanime.data.model

import com.google.gson.annotations.SerializedName

data class AnimeSearchResponse(
    @SerializedName("data") val data: List<Anime>
)

data class AnimeDetailResponse(
    @SerializedName("data") val data: Anime
)

data class GenreResponse(
    @SerializedName("data") val data: List<Genre>
)