package com.ViveApps.themovies.media_details.domain.repository

import com.ViveApps.themovies.main.domain.models.Media
import com.ViveApps.themovies.util.Resource
import kotlinx.coroutines.flow.Flow

interface DetailsRepository {

    suspend fun getDetails(
        type: String,
        isRefresh: Boolean,
        id: Int,
        apiKey: String
    ): Flow<Resource<Media>>

}










