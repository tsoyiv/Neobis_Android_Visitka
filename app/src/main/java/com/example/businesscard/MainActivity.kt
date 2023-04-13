package com.example.businesscard

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.businesscard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textHello
        supportActionBar?.setBackgroundDrawable(ColorDrawable(getColor(R.color.white)))

        binding.button.setOnClickListener {
            Intent(this, SecondActivity::class.java).also {
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                startActivity(it)
            }
        }
        binding.button2.setOnClickListener {
            Intent(this, ThirdActivity::class.java).also {
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                startActivity(it)
            }
        }
        binding.button5.setOnClickListener {
            Intent(this, FourthActivity::class.java).also {
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                startActivity(it)
            }
        }
        binding.button6.setOnClickListener {
            Intent(this, FifthActivity::class.java).also {
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                startActivity(it)
            }
        }
        binding.button8.setOnClickListener {
            Intent(this, SixthActivity::class.java).also {
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                startActivity(it)
            }
        }
    }
}