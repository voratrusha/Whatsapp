package com.example.whatsapp

import Adapter.PagerAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.viewpager.widget.ViewPager
import com.example.whatsapp.databinding.ActivityPage2Binding
import com.google.android.material.tabs.TabLayout

class  Page2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityPage2Binding.inflate(layoutInflater)
        setContentView(binding.root)
  //one method of binding
//        binding.tablayout.addTab(binding.tablayout.newTab().setText("Chats"))
//        binding.tablayout.addTab(binding.tablayout.newTab().setText("Status"))
//        binding.tablayout.addTab(binding.tablayout.newTab().setText("Calls"))
        var adapter = PagerAdapter(supportFragmentManager)
        binding.mainpager.adapter = adapter
        binding.tablayout.setupWithViewPager(binding.mainpager)
    }
}


