package com.example.myrankapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TheShop : AppCompatActivity() {
    private var x = 0

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.the_shop)

        // Activity開始時にIntentを取得し、文字列をセットする
        val intent: Intent = intent
        val message: String? = intent.getStringExtra(MainActivity().EXTRA_MESSAGE)
        val textView: TextView = findViewById(R.id.txs2)

        val imageView2: ImageView = findViewById(R.id.image1)
        imageView2.setImageResource(R.drawable.ketyan)
        textView.text = message

        ranDom()
        tenTyo()
    }

    private fun ranDom() {
        x = (0..3).random()
    }

    @SuppressLint("SetTextI18n")
    fun tenTyo() {

        val txs1: TextView = findViewById(R.id.txs1)

        if (x == 0){
            txs1.text = "よく来たな！見ていってくれよ！"
        }
        if (x == 1){
            txs1.text = "おう！何だてめえ！ひやかしならけえってくれよな！"
        }
        if (x == 2){
            txs1.text = "よう！kz！へっ！"
        }
        if (x == 3){
            txs1.text = "金無しにやるもんなんか無ぇぞ！どうなんだ！"
        }
    }


}