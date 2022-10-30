package com.lwemzy.wallmartapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userList:ArrayList<User> = loadCredentials()

     val loginBtn = findViewById<Button>(R.id.btn_login)
        val forgot = findViewById<TextView>(R.id.forgot_pwd)
        val email = findViewById<EditText>(R.id.email)
        forgot.setOnClickListener{
            val email = email.text?.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.type = "text/plain"
            var userPwd:String? = ""
            for(u in userList){
                if(u.username.equals(email)){
                    userPwd = u.password;
                }
            }
            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf( email));
            intent.putExtra(Intent.EXTRA_SUBJECT, "Password Reset");
            if(email !=null && userPwd !=null) {
                intent.putExtra(Intent.EXTRA_TEXT, "your password is $userPwd")
                startActivity(intent)
            }

        }
        val createBtn = findViewById<Button>(R.id.create)

        loginBtn.setOnClickListener {

            val password = findViewById<EditText>(R.id.password)

            for(user in userList){
                if(user.username.equals(email.text.toString()) && user.password.equals(password.text.toString())){
                    var intent = Intent(this, ShoppingActivity::class.java)
                        intent.putExtra("username", email.text.toString())
                        startActivity(intent)
                }
            }
        }

        val resultContracts = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){ result->
            if(result.resultCode == Activity.RESULT_OK) {
                val res = result.data?.getSerializableExtra("user")
                if(res !=null){
                    val user = res as User
                    userList.add(user)

                }

            }

        }

        createBtn.setOnClickListener {

            val intent = Intent(this, RegisterActivity::class.java)
            resultContracts.launch(intent)
        }
    }

    private fun loadCredentials(): ArrayList<User> {
        val alex: User = User("Alex", "Mukasa", "alec8922@gmail.com", "awesome");
        val anonymous: User = User("Anonymous", "Hacker", "ahacker@gmail.com", "test");

        return arrayListOf(alex, anonymous);
    }
}