package com.example.mad255_firebasemessaging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
/*
NOTES:
Tools>Firebase>Cloud Messaging>Select*
gear(far right)>update sdk to 1.8
gear(far right)>project structure>properties: setBuild tools to 31 or newer

Firebase assistant>setup cloud messaging
firebase assistant>setup FCM

added line above application in manifest:
<uses-permission android:name="android.permission.INTERNET"/>

should be good to go after this.

msg can be sent from firebase console: console.firebase
TESTED AND WORKING.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}