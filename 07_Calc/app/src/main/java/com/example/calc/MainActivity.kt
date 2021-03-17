package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // 符号キー押下直後フラグ
    var flgPushMark = false

    // 退避（値１、符号）
    var tmpVal01 = 0
    // タグの１を入力すると最初から足すという計算式が成り立つ。
    var tmpMark = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // 数字キー押下時
    fun pushNumber(view: View) {

        // 画面で押されたタグを取得する処理。
        val num = view.tag.toString()

        // 押下されたボタンが表示さるか確認 ToastとLog二つの方法。
//        Toast.makeText(this, num, Toast.LENGTH_SHORT).show()
//        Log.v("hoge", num)

        if (tvCalc.text == "0" || flgPushMark)
            // 値の上書き（初期値が0のため）
            tvCalc.text = num
        else
            // 値の追加（末尾）
            tvCalc.append(num)

        // 符号キー押下直後フラグOFF
        flgPushMark = false

    }

    // 符号キー押下時
    fun pushMark(view: View) {

        // もし直前で符号キーが押されているかを判断しての処理
        if (flgPushMark) {
            // 符号退避 （次の計算に備えるため符号を変数に保持させる）
            tmpMark = view.tag.toString().toInt()
            // 処理を終了させる。
            return
        }

        // 値２の取得
        val val02 = tvCalc.text.toString().toInt()

        // 計算
        when (tmpMark) {
            1 -> tmpVal01 += val02
            2 -> tmpVal01 -= val02
            3 -> tmpVal01 *= val02
            4 -> tmpVal01 /= val02
        }

        // 計算結果の表示
        tvCalc.text = tmpVal01.toString()

        // 符号退避 （次の計算に備えるため符号を変数に保持させる）
        tmpMark = view.tag.toString().toInt()

        // 符号キー押下直後フラグON
        flgPushMark = true

    }


    // 「ｃ」キー押下時
    fun pushClear(view: View) {

        flgPushMark = false

        // 退避（値１、符号）
        tmpVal01 = 0
        tmpMark = 1

        tvCalc.text = "0"
    }
}