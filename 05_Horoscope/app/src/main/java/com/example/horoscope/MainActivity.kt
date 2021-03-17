package com.example.horoscope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    // [星座判定]ボタン押下時
    fun getSeiza(view: View) {

        // 月と日を取得
        val mm = etTuki.text.toString().toInt()
        val dd = etHi.text.toString().toInt()

        // 月と日を合わせて表示
        val md = mm * 100 + dd

        // 星座判定 （Javaでは使用できないKotlinの記述。）
        when (md) {
            in 321..331, in 401..419 -> {
                tvSeiza.text = "牡羊座"
                // 画像セット
                ivSeiza.setImageResource(R.drawable.img01)
            }
            in 420..430, in 501..520 -> {
                tvSeiza.text = "牡牛座"
                ivSeiza.setImageResource(R.drawable.img02)
            }
            in 521..531, in 601..621 -> {
                tvSeiza.text = "双子座"
                ivSeiza.setImageResource(R.drawable.img03)
            }
            in 622..630, in 701..722 -> {
                tvSeiza.text = "蟹座"
                ivSeiza.setImageResource(R.drawable.img04)
            }
            in 723..731, in 801..822 -> {
                tvSeiza.text = "獅子座"
                ivSeiza.setImageResource(R.drawable.img05)
            }
            in 823..831, in 901..922 -> {
                tvSeiza.text = "乙女座"
                ivSeiza.setImageResource(R.drawable.img06)
            }
            in 923..930, in 1001..1023 -> {
                tvSeiza.text = "天秤座"
                ivSeiza.setImageResource(R.drawable.img07)
            }
            in 1024..1031, in 1101..1122 -> {
                tvSeiza.text = "さそり座"
                ivSeiza.setImageResource(R.drawable.img08)
            }
            in 1123..1131, in 1201..1221 -> {
                tvSeiza.text = "射手座"
                ivSeiza.setImageResource(R.drawable.img09)
            }
            in 1222..1231, in 101..119 -> {
                tvSeiza.text = "山羊座"
                ivSeiza.setImageResource(R.drawable.img10)
            }
            in 120..131, in 201..218 -> {
                tvSeiza.text = "みずがめ座"
                ivSeiza.setImageResource(R.drawable.img11)
            }
            in 219..229, in 301..320 -> {
                tvSeiza.text = "うお座"
                ivSeiza.setImageResource(R.drawable.img12)
            }
            // その他の場合の処理
            else -> {
                tvSeiza.text = "日付が不正"
                ivSeiza.setImageResource(0)
            }

        }
    }
}