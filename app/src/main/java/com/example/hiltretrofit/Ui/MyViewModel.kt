package com.example.hiltretrofit.Ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hiltretrofit.model.Post
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(val postRepository: MyRepository) : ViewModel() {

    fun getPost(): Flow<ArrayList<Post>> =  flow {
            val post = postRepository.getPost()
            emit(post)
    }

}