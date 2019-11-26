package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSend.setOnClickListener(){
            //Create an explicit intent.
            // Two para(this, Component Name)
            val intent = Intent(this,Second::class.java)

            val phone = editTextPhone.text.toString()
            intent.putExtra(Extra_Phone,phone)
            startActivity(intent)

        }
    }
    companion object{
        const val Extra_Phone ="com.example.intent.PHONE"
    }
}//end of class
