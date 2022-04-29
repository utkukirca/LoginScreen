package com.utkukirca.loginscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.utkukirca.loginscreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var username : String? = null
    var password : String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }


    fun login (view : View){

        username = binding.userNameInput.text.toString()
        password = binding.passwordInput.text.toString()


        if (username == "" || password == "") {

            val alert = AlertDialog.Builder(this@MainActivity)
            alert.setTitle("Error")
            alert.setMessage("Password & username bos birakilamaz")

            alert.setPositiveButton("Anladim") { dialog, which ->

                //OnClick Listener
                Toast.makeText(this, "Tekrar giris yapiniz", Toast.LENGTH_LONG).show()
            }


            alert.show()
        }
        else {

            val intent = Intent(applicationContext, LogedUser::class.java)
            intent.putExtra("username", username)
            intent.putExtra("password", password)
            startActivity(intent)
            finish()


        }

    }





}