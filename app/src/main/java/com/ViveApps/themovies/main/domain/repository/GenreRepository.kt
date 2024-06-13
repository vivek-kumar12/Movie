package com.ViveApps.themovies.main.domain.repository

import com.ViveApps.themovies.util.Resource
import com.ViveApps.themovies.main.domain.models.Genre
import kotlinx.coroutines.flow.Flow

interface GenreRepository {
    suspend fun getGenres(
        fetchFromRemote: Boolean,
        type: String,
        apiKey: String
    ): Flow<Resource<List<Genre>>>
}










