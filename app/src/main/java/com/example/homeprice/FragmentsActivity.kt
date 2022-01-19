package com.example.homeprice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homeprice.databinding.ActivityFragmentsBinding

class FragmentsActivity:AppCompatActivity() {
    lateinit var binding : ActivityFragmentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .add(R.id.containersFragment,MainActivity())
            .commit()

    }
}