package com.example.mohamedsofy.kotlinemojis

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_emoji_detail.*

class EmojiDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emoji_detail)

        val emoji = intent.extras.getString("emoji")
        val position = intent.extras.getString("position")
        emojiDetailTextView.text = emoji
        number_view.text = position
    }

}
