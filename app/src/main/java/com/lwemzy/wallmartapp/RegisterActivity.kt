package com.lwemzy.wallmartapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val btnCreate = findViewById<Button>(R.id.create)
        btnCreate.setOnClickListener {
            val firstname = findViewById<EditText>(R.id.firstname)
            val lastname = findViewById<EditText>(R.id.lastname)
            val email = findViewById<EditText>(R.id.email)
            val password = findViewById<EditText>(R.id.password)
            val fname:String? = firstname.text?.toString()
            val lname:String? = lastname.text?.toString()
            val em:String? = email.text?.toString()
            val pwd:String? = password.text?.toString()

            val user = User(fname,lname,em,pwd);
            val intent = intent
            intent.putExtra("user",user)
            setResult(Activity.RESULT_OK, intent)
            Toast.makeText(this,"Account Created", Toast.LENGTH_LONG).show()

            finish()
        }
    }
}