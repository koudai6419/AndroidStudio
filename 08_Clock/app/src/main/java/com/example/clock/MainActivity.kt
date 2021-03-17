package com.example.clock

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		// 画面横向き設定
		requestedOrientation =
				ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE

		// whileでは画面表示されない。
//		while (true) {
//			tvClock.append("T")
//
//			Log.v("hoge", "T")
//		}


		// 書式設定
		val df = SimpleDateFormat(
				"yyyy/MM/dd\nHH:mm:ss")

		// 1000ミリ秒　＝　1秒  schedule補完機能→メソッド（mマーク）ではなく、ファンクション（fマーク）を選択。
		Timer().schedule(0, 1000) {


			// 現在の日時を取得する。　Dateクラスの利用。
						// Javaでの記述方法 Date dat = new Date();

			// 省略しない形
//			val dat = Date()
//			val str = df.format(dat)

			// 省略した形
			val str = df.format(Date())

			tvClock.text = str

		}
	}
}