package com.example.android.searchdebounce

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView



class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
    var navigationView = findViewById<NavigationView>(R.id.nav_view)

}


