package com.example.svash.myprofile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class HomeScreen : AppCompatActivity() {

    var photo: ImageView? = null
    var eduButton: Button? = null
    var workButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_screen)

        photo = findViewById(R.id.profilePhoto)
        eduButton = findViewById(R.id.eduButton)
        workButton = findViewById(R.id.workButton)
        var clickIntent = Intent(this@HomeScreen, ProfilePhoto::class.java)
        var eduIntent = Intent(this@HomeScreen, Education::class.java)
        var workIntent = Intent(this@HomeScreen, WorkExperience::class.java)
        photo?.setOnClickListener({startActivity(clickIntent)})
        eduButton?.setOnClickListener({startActivity(eduIntent)})
        workButton?.setOnClickListener({startActivity(workIntent)})

    }
}
