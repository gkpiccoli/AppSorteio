package com.gkpdev.meuprimeirprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.gkpdev.meuprimeirprojeto.R.id.text_result
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortButton(view: View) {
        val textResult = findViewById<TextView>(R.id.text_result)
        val number = java.util.Random().nextInt(11)
        textResult.setText("O número sorteado foi o : $number")
    }

}