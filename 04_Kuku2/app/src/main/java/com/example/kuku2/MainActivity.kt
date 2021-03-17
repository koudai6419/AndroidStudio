package com.example.kuku2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        for (i in 1..9) {
//            // トースト表示。　エミュレーター下部に表示。　小文字のtから始める。大文字のTだとクラス。
////            Toast.makeText(this, i.toString(), Toast.LENGTH_SHORT).show()
//
//            // ログ表示
//            Log.v("hoge", i.toString())
//        }

        for (i in 1..9) {

            for (j in 1..9) {

                // 文字列補完　（　{}は1文字以上　）   Javaではデータ型をStringに変換処理が必要だった。
                val str = "$i × $j = ${i * j}"
                Log.v("hoge", str)

                // 上書きされて最後の計算式しか表示されない。
//                tvKuku.text = str

                // 追加処理 および \nで改行
                tvKuku.append("$str\n")
            }
        }

        var i = 0
        while (i < 5) {
            Log.v("hoge", "$i")
            i++
        }


        do {
            Log.v("hoge", "$i")
            i--
        } while (i > 0)
    }
}