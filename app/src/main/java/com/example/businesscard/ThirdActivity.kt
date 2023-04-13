package com.example.businesscard

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.businesscard.databinding.ActivitySecondBinding
import com.example.businesscard.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val email = binding.emailButton
        val emailAddress = "tsoiivv@gmail.com"
        val call = binding.callButton
        val phoneNumber = "+996773719092"
        val map = binding.mapButtonId

        email.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL, arrayOf(emailAddress))
                `package` = "com.google.android.gm"
            }
            startActivity(intent)
        }
        call.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:$phoneNumber")
            }
            startActivity(intent)
        }
        map.setOnClickListener {
            val address = "Азия Молл, Chui Avenue 191, Bishkek, Kyrgyzstan"
            val uri = Uri.parse("geo:0,0?q=$address")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
    }
}