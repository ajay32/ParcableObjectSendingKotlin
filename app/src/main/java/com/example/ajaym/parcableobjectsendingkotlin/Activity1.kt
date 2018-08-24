package com.example.ajaym.parcableobjectsendingkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.ajaym.parcableobjectsendingkotlin.model.Person

class Activity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

           val intent = Intent(this, Activity2::class.java)
        val person = Person("Ajay Me3ta", 25, "dev.ajaymehta@gmail.com", 999999999)

        intent.putExtra("stringvalue", "hello you")
        intent.putExtra("personobject", person) // sending object (model) to one activity to another

        startActivity(intent)
    }
}
