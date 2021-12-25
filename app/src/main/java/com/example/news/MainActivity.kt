package com.example.news

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.news.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter = Adapter()
    private val imageIdList = listOf(
        R.drawable.ic_nar,
        R.drawable.ic_rich,
        R.drawable.ic_thiefs,
        R.drawable.ic_thirty,
        R.drawable.ic_wedding
    )
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() = with(binding){
        binding.apply {
            recyclerView.layoutManager = GridLayoutManager(this@MainActivity, 3)
            recyclerView.adapter = adapter
            button4.setOnClickListener{
                if(index > 4) index = 0
                val news = DataClass(imageIdList[index], "nar $index")
                adapter.addNews(news)
                index++
            }
        }
    }
}

