package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.core.Toast.toastty

class MainActivity : AppCompatActivity() {
    lateinit var nam: EditText
    lateinit var ShowToast: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews()
        showName()
    }

    fun setupViews()
    {
        nam = findViewById(R.id.name)
        ShowToast = findViewById(R.id.button)

    }

    fun showName()
    {
       ShowToast.setOnClickListener {
           toastty().toastDisp(this,nam.text.toString())
       }
    }
}