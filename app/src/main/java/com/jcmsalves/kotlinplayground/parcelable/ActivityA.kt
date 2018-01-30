package com.jcmsalves.kotlinplayground.parcelable

import android.app.Activity
import android.content.Intent
import android.os.Bundle

class ActivityA : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(this, ActivityB::class.java)
        val person = Person("name", 32, "email@email.com", 1234)

        intent.putExtra("A_STRING", "some string")
        intent.putExtra("A_NUMBER", 1234)
        intent.putExtra("AN_OBJECT", person)

        startActivity(intent)
    }
}
