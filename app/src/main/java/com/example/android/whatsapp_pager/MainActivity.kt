package com.example.android.whatsapp_pager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import viewPagerAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout : TabLayout = findViewById(R.id.tablayout)
        val viewPager: ViewPager = findViewById(R.id.viewPager)
        val Toolbar : Toolbar = findViewById(R.id.mytoolbar)

        setSupportActionBar(Toolbar)

        supportActionBar?.setTitle("WhatsApp")

        viewPager.adapter = viewPagerAdapter(supportFragmentManager)

        tabLayout.setupWithViewPager(viewPager)
    }
}