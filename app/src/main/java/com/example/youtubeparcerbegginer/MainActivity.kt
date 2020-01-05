package com.example.youtubeparcerbegginer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    private lateinit var toolBar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        toolBar = findViewById(R.id.toolBar)
        toolBar.title = ""
        setSupportActionBar(toolBar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }
}
