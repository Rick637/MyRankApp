package com.example.myrankapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val EXTRA_MESSAGE: String = "com.example.myrankapp.MESSAGE"
   // val bt1: Button = findViewById(R.id.bt1)
  //  val bt2: Button = findViewById(R.id.bt2)

    private var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("SetTextI18n")
    fun jG() {
        val tx2: TextView = findViewById(R.id.tx2)
        tx2.setBackgroundColor(Color.parseColor("#3F00FF00"))

        if (0 > i){
            tx2.text = "マイナス！？チーターにでも会ったか？"
            tx2.setBackgroundColor(Color.parseColor("#F6F2F2"))
        }
        if (i == 0){     //200<= i < 400
            tx2.text = "バーカ"
            tx2.setBackgroundColor(Color.parseColor("#3F11FF55"))
        }
        if (i in 200..399){     //200<= i < 400
            tx2.text = "ギリ留年する程度の行動力"
            tx2.setBackgroundColor(Color.parseColor("#3F00FF00"))
        }
        if (i in 400..999){
            tx2.text = "現役卒業する程度の行動力"
            tx2.setBackgroundColor(Color.parseColor("#F6F2F2"))
        }
        if (i in 1000..1799){
            tx2.text = "ワンチャンYouTuberで売れる程度の行動力"
            tx2.setBackgroundColor(Color.parseColor("#3F00FF00"))
        }
        if (i in 1800..9999){
            tx2.text = "You are セイキン"
            tx2.setBackgroundColor(Color.parseColor("#F6F2F2"))
        }
    }

    @SuppressLint("SetTextI18n")
    fun upBt(view: View) {
        val tx1: TextView = findViewById(R.id.tx1)
        i += 100
        tx1.text = "Your Point : $i"
        jG()
    }

    @SuppressLint("SetTextI18n")
    fun downBt(view: View) {
        val tx1: TextView = findViewById(R.id.tx1)
        i -= 100
        tx1.text = "Your Point : $i"
        jG()
    }

    fun moveShop(view: View) {
        val intent = Intent(this@MainActivity,
            TheShop::class.java)
        val tx1: TextView = findViewById(R.id.tx1)
        val message: String = tx1.text.toString()
        intent.putExtra(EXTRA_MESSAGE, message)   //持っていくもの
        startActivity(intent)
    }

}
