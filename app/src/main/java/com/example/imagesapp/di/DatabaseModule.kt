package com.example.imagesapp.di

import android.content.Context
import androidx.room.Room
import com.example.imagesapp.data.local.UnsplashDatabase
import com.example.imagesapp.util.Constants.UNSPLASH_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): UnsplashDatabase {
        return Room.databaseBuilder(context, UnsplashDatabase::class.java, UNSPLASH_DATABASE).build()
    }


}