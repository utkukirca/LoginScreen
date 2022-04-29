package com.utkukirca.loginscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.utkukirca.loginscreen.databinding.ActivityLogedUserBinding
import com.utkukirca.loginscreen.databinding.ActivityMainBinding

class LogedUser : AppCompatActivity() {

    private lateinit var binding: ActivityLogedUserBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogedUserBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }


    fun showUserInfo ( view : View) {
        val username = intent.getStringExtra("username")
        val password = intent.getStringExtra("password")

        binding.usernameText.text = "Username: " + username
        binding.passwordText.text = "Password: " + password

    }

}