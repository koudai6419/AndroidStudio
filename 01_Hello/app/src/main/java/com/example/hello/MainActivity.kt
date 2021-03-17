package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

	// 画面生成時
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)


		// ボタンを押した時
		button01.setOnClickListener {

			//入力値の取得
//			javaでは：String nam =
//			valはデータ型ではない。Kotlinではデータ型は必須ではない。
			val nam = editText01.text.toString()

			//入力値の表示
			textView01.text = nam + "さん、こんにちは！"
		}
	}
}