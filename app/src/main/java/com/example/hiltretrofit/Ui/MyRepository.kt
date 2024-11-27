package com.example.hiltretrofit.Ui

import com.example.hiltretrofit.dao.PostRequest
import javax.inject.Inject

class MyRepository @Inject constructor(val postRequest: PostRequest) {
    suspend fun getPost() = postRequest.getPost()
}

