package com.rafaelpimenta.logutilexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.rafaelpimenta.logutil.LogDebug


class MainActivity : AppCompatActivity() {

    private lateinit var edtFrase: EditText
    private lateinit var btnLog: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtFrase = findViewById(R.id.edtFrase)
        btnLog = findViewById(R.id.btnLog)

        btnLog.setOnClickListener {
            LogDebug().print(edtFrase.text.toString() ?: "Sem dados")
        }

    }
}