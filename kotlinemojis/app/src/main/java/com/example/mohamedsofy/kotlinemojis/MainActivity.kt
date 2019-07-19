package com.example.mohamedsofy.kotlinemojis

import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var layoutManager : GridLayoutManager
    lateinit var adapter : EmojiAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            layoutManager = GridLayoutManager(this,1)
            recyclerView.layoutManager = layoutManager

            adapter = EmojiAdapter(arrayListOf("🎶","😢","🎅","😂","⛪","💰","😎","🤢","👌","❤","🤦‍","♀","👀","🎁","🎉","😍","✨","⛪","💰","😎","🤢"))
            recyclerView.adapter = adapter
    }
}
