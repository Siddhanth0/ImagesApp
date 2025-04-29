package com.example.imagesapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.imagesapp.data.local.dao.UnsplashImageDao
import com.example.imagesapp.data.local.dao.UnsplashRemoteKeysDao
import com.example.imagesapp.model.UnsplashImage
import com.example.imagesapp.model.UnsplashRemoteKeys


@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase : RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao

}