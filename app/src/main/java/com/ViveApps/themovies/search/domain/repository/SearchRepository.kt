package com.ViveApps.themovies.search.domain.repository

import com.ViveApps.themovies.util.Resource
import com.ViveApps.themovies.main.domain.models.Media
import kotlinx.coroutines.flow.Flow

interface SearchRepository {
    suspend fun getSearchList(
        fetchFromRemote: Boolean,
        query: String,
        page: Int,
        apiKey: String
    ): Flow<Resource<List<Media>>>

}










