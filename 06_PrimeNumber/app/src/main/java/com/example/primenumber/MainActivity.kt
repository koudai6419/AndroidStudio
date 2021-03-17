package com.example.primenumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btCheckPrime.setOnClickListener {

            // 素数判定処理-------------------------------------

            // 値の取得
            val num = etNumber.text.toString().toInt()

            var cnt = 0

            for (dev in 1..num) {
                // 割り切れた場合インクリメント処理
                if (num % dev == 0) cnt++
            }

            // 素数判定
            if (cnt == 2) tvResult.text = "素数"
            else tvResult.text = "素数でない"

            // ---------------------------------------------------
        }
    }
}