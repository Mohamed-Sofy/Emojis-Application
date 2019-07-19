package com.example.mohamedsofy.kotlinemojis


import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_emoji_detail.view.*
import kotlinx.android.synthetic.main.recycle_item.view.*

class EmojiAdapter (val emojis : ArrayList<String>  ) : RecyclerView.Adapter<EmojiAdapter.TextHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): EmojiAdapter.TextHolder {
        return TextHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycle_item, parent,
            false))
    }

    override fun getItemCount(): Int {
        return emojis.count()
    }


    override fun onBindViewHolder(holder: EmojiAdapter.TextHolder, position: Int) {
        val emoji = emojis[position]
        var pos : String = (position+1).toString()
        holder.BindEmojis(emoji,pos)
    }

class TextHolder(v : View) : RecyclerView.ViewHolder(v),View.OnClickListener{


    var view : View = v
    var emoji : String = ""
    var number : String = ""

    init {
        v.setOnClickListener(this)
    }

    fun BindEmojis(Emoji : String , pos : String ){
        this.emoji = Emoji
        view.itemTextView.text = emoji
        this.number = pos
    }

    override fun onClick(v: View?) {
        val detailIntent = Intent(view.context, EmojiDetail::class.java)
        detailIntent.putExtra("emoji", emoji)
        detailIntent.putExtra("position", number)
        startActivity(view.context,detailIntent,null)
    }

}
}