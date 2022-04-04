package com.example.homeprice.a

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homeprice.R
import com.example.homeprice.a.FragmentOne
import com.example.homeprice.databinding.ActivityMainBinding

class MainActivity :AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentsContainer, FragmentOne())
            .commit()

    }
}