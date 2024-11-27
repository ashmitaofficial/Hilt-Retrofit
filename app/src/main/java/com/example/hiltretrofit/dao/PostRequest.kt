package com.example.hiltretrofit.dao

import com.example.hiltretrofit.model.Post
import retrofit2.http.GET

interface PostRequest {
    @GET("posts")
    suspend fun getPost(): ArrayList<Post>
}