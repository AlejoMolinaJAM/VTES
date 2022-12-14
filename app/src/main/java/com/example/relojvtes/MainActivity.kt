package com.example.relojvtes

import android.content.IntentSender.OnFinished
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var visualizar : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        visualizar = findViewById(R.id.visualizar)

        object : CountDownTimer(7200*1000, 10000){
            override fun onTick(millisUntilFinished:  Long) {
                visualizar.setText("quedan" + millisUntilFinished /1000 + "seg")


                val text = "Suerte, Matusalenes."
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()
            }

            override fun onFinish() {

                visualizar.setText("Se acabó")

            }

        }.start()


    }
}



