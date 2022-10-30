package com.lwemzy.wallmartapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class ShoppingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)
        val intent = intent
        val username = intent.getStringExtra("username")
        val welEditText = findViewById<TextView>(R.id.welcome)
        welEditText.text = "Welcome $username"
        val electronics = findViewById<ImageView>(R.id.electronics)
        val clothing = findViewById<ImageView>(R.id.clothing)
        val beauty = findViewById<ImageView>(R.id.beauty)
        val food = findViewById<ImageView>(R.id.food)
        electronics.setOnClickListener{
            Toast.makeText(this,"You have chosen the Electronics category of shopping", Toast.LENGTH_LONG).show()
        }
        clothing.setOnClickListener{
            Toast.makeText(this,"You have chosen the Clothing category of shopping", Toast.LENGTH_LONG).show()

        }
        beauty.setOnClickListener{
            Toast.makeText(this,"You have chosen the Beauty category of shopping", Toast.LENGTH_LONG).show()

        }
        food.setOnClickListener{
            Toast.makeText(this,"You have chosen the Food category of shopping", Toast.LENGTH_LONG).show()

        }


    }
}