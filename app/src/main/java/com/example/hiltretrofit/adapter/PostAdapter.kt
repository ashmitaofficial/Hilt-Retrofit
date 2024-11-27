package com.example.hiltretrofit.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hiltretrofit.databinding.ItemBinding
import com.example.hiltretrofit.model.Post
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PostAdapter @Inject constructor() : RecyclerView.Adapter<PostAdapter.MyViewHolder>() {

    lateinit var postList: ArrayList<Post>
    fun setData(list: ArrayList<Post>) {
        this.postList = list
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text = postList[position].title.toString()
    }

    class MyViewHolder(view: ItemBinding) : RecyclerView.ViewHolder(view.root) {
        val title = view.titleTxt
    }
}