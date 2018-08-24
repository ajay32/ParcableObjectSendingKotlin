package com.example.ajaym.parcableobjectsendingkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ajaym.parcableobjectsendingkotlin.model.Person

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val myValue :String = intent.getStringExtra("stringvalue")

        val mPersonObject : Person = intent.getParcelableExtra("personobject");


        Toast.makeText(this, "${myValue} ${mPersonObject}", Toast.LENGTH_SHORT).show();

    }
}
