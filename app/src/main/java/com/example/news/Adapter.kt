package com.example.news

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.news.databinding.NewsItemBinding

class Adapter: RecyclerView.Adapter<Adapter.ViewHolder>() {
    val newsList = Array<DataClass>()

    private fun <T> Array(): Array<DataClass> {
        TODO("Not yet implemented")
    }

    class ViewHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = NewsItemBinding.bind(item)
        fun bind(news: DataClass) = with(binding){


        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(newsList[position])
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    fun addNews(news: DataClass){
        newsList.add(news)
        notifyDataSetChanged()
    }
}

private fun <T> Array<T>.add(news: DataClass) {
    TODO("Not yet implemented")
}




