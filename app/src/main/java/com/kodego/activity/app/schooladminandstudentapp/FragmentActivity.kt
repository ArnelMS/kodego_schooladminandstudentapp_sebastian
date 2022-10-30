package com.kodego.activity.app.schooladminandstudentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kodego.activity.app.schooladminandstudentapp.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {

    private lateinit var binding : ActivityFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentOne = FragmentOne()
        val fragmentTwo = FragmentTwo()
        val fragmentThree = FragmentThree()

        supportFragmentManager.beginTransaction().apply {
            replace(binding.fragmentMain.id, fragmentOne)
            commit()
        }
        binding.btnFragmentOne.setOnClickListener() {
            supportFragmentManager.beginTransaction().apply {
                replace(binding.fragmentMain.id, fragmentOne)
                commit()
            }
        }
        binding.btnFragmentTwo.setOnClickListener() {
            supportFragmentManager.beginTransaction().apply {
                replace(binding.fragmentMain.id, fragmentTwo)
                commit()
            }
        }
        binding.btnFragmentThree.setOnClickListener() {
            supportFragmentManager.beginTransaction().apply {
                replace(binding.fragmentMain.id, fragmentThree)
                commit()
            }
        }
    }
}