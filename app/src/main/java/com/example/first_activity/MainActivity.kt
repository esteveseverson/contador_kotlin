package com.example.first_activity

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var cont = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val text_contador = findViewById<TextView>(R.id.textView)
        val btn_aumentar = findViewById<Button>(R.id.activity_main_btn_aumentar)
        val btn_diminuir = findViewById<Button>(R.id.activity_main_btn_diminuir)

        btn_aumentar.setOnClickListener{
            text_contador.text = "${++cont}"
        }

        btn_diminuir.setOnClickListener{
            if (cont >= 1) {
                text_contador.text = "${--cont}"
            }
        }

    }
}