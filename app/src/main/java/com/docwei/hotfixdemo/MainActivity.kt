package com.docwei.hotfixdemo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val classLoader = classLoader
    }
    //修复--加载补丁
    fun clickMe(view: android.view.View) {

    }

    //直接跳转
    fun clickMe2(view: android.view.View) {
        val intent = Intent(this@MainActivity, SecondActivity::class.java)
        startActivity(intent)
    }
}