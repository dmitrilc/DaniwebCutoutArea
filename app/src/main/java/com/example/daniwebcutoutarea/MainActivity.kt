package com.example.daniwebcutoutarea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Hide the system bars
        val windowInsetsController: WindowInsetsControllerCompat? = ViewCompat.getWindowInsetsController(window.decorView) //gets WindowInsetsController
        windowInsetsController?.hide(WindowInsetsCompat.Type.systemBars()) //Hides system bars (notification bar + navigation bar)

        //Enables Edge 2 Edge, allowing the app window to extend behind the system bars
        WindowCompat.setDecorFitsSystemWindows(window, false)
    }

}