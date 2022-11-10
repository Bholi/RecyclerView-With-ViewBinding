package com.example.rvwithbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rvwithbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: Adapter
    private lateinit var list: ArrayList<Info>
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.setHasFixedSize(true)

        list = ArrayList()
        list.add(Info(R.drawable.infinite,"Infinite"))
        list.add(Info(R.drawable.liger,"Liger"))
        list.add(Info(R.drawable.ram,"Ram Setu"))
        list.add(Info(R.drawable.pathan,"Pathaan"))
        list.add(Info(R.drawable.infinite,"Infinite"))
        list.add(Info(R.drawable.liger,"Liger"))
        list.add(Info(R.drawable.ram,"Ram Setu"))
        list.add(Info(R.drawable.pathan,"Pathaan"))

        adapter = Adapter(list)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }
}