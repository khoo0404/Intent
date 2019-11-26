package com.example.intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import kotlinx.android.synthetic.main.activity_second.*

class Second : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val phone = intent.getStringExtra(MainActivity.Extra_Phone) // who called me?
       // val age:Int = intent.getIntExtra("age",0)
        textViewPhone.text = String.format("%s", phone)

        buttonCall.setOnClickListener{
            val PhoneUri = Uri.parse("tel:" + phone)
            //Declare an implicit intent
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(PhoneUri)
            //validate intent using the packageManager
            if(intent.resolveActivity(packageManager)!=null){
                startActivity(intent)
            }

        }
    }
}
