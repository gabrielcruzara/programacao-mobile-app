package com.example.gbpro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val botao4 = findViewById<Button>(R.id.button4)

        botao4.setOnClickListener{

            IrParaTela1()
        }
    }

    private fun IrParaTela1() {
        var tela1 = Intent(this,ThirdActivity::class.java)
        startActivity(tela1)
    }
}