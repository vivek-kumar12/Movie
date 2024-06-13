package com.ViveApps.themovies.main.data.remote.dto

import com.ViveApps.themovies.main.domain.models.Genre

data class GenresListDto(
    val genres: List<Genre>
)