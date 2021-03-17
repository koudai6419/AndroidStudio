package com.example.simplecalc2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // onCreate：画面の作成時に行われる処理
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lsn = View.OnClickListener {

// lsnの変数処理によりコメントアウト------------------------
//        }
//
//        // 足すボタン押下時
//        btTasu.setOnClickListener {
// ------------------------------------------------------

            // 入力値の取得処理 （データ型の推論）。　textとは属性（プロパティ）
//            val v01 = etValue01.text.toString().toInt()
//            val v02 = etValue02.text.toString().toInt()


            // 上のv01の場合は、空白で処理ボタン押下すると、空文字は数値に変換できないためエラー。　if文で条件分岐（equalsではない）
            val s01 = etValue01.text.toString()
            val s02 = etValue02.text.toString()

            if (s01 == "" || s02 == "")
                return@OnClickListener
            val v01 = s01.toInt()
            val v02 = s02.toInt()


            // 計算
//            val res = v01 + v02
            var res = 0

            // it ： 押された値 (idが押されたとき)
            when (it.id) {
                // 足すボタンが押されたとき
                R.id.btTasu ->
                    res = v01 + v02
                R.id.btHiku ->
                    res = v01 - v02
                R.id.btKakeru ->
                    res = v01 * v02
                R.id.btWaru -> {

                    if (v02 == 0) {
                        tvResult.text = "0で割っちゃダメ"
                        return@OnClickListener
                    }

                    res = v01 / v02
                }
            }

            // 結果の表示
            tvResult.text = res.toString()
        }

        // Javaでは行ってなかった処理（Javaでは値のみ変数に保持させていた。）　「入力値取得から結果表示」までの処理の塊をlsnという変数に保持させる。 →// 足すボタン押下時をコメントアウトする。
        btTasu.setOnClickListener(lsn)
        btHiku.setOnClickListener(lsn)
        btKakeru.setOnClickListener(lsn)
        btWaru.setOnClickListener(lsn)
    }
}