package com.rdkardo.firebasetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(2000)
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val analytics: FirebaseAnalytics  =  FirebaseAnalytics.getInstance(this)
        val bundle = Bundle()
        bundle.putString("Message","Integración de Firebase completa")
        analytics.logEvent("InitScreen",bundle)
    }
}