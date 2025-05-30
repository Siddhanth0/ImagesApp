package com.example.imagesapp.data.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.imagesapp.data.local.UnsplashDatabase
import com.example.imagesapp.data.paging.SearchPagingSource
import com.example.imagesapp.data.paging.UnsplashRemoteMediator
import com.example.imagesapp.data.remote.UnsplashApi
import com.example.imagesapp.model.UnsplashImage
import com.example.imagesapp.util.Constants.ITEMS_PER_PAGE
import kotlinx.coroutines.flow.Flow
import retrofit2.http.Query
import javax.inject.Inject

@OptIn(ExperimentalPagingApi::class)
class Repository @Inject constructor(
    private val unsplashApi: UnsplashApi,
    private val unsplashDatabase: UnsplashDatabase
){
    fun getAllImages(): Flow<PagingData<UnsplashImage>> {
        val pagingSourceFactory = { unsplashDatabase.unsplashImageDao().getAllImages() }
        return Pager(
            config = PagingConfig(pageSize = ITEMS_PER_PAGE),
            remoteMediator = UnsplashRemoteMediator(unsplashApi, unsplashDatabase),
            pagingSourceFactory = pagingSourceFactory
        ).flow
    }

    fun searchImages(query: String): Flow<PagingData<UnsplashImage>> {
        return Pager(
            config = PagingConfig(pageSize = ITEMS_PER_PAGE),
            pagingSourceFactory = {
                SearchPagingSource(unsplashApi = unsplashApi, query = query)
            }
        ).flow
    }

}