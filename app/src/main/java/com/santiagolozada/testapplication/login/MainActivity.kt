package com.santiagolozada.testapplication.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.santiagolozada.testapplication.databinding.ActivityMainBinding
import com.santiagolozada.testapplication.onboarding.WelcomeActivity

private const val USERNAME = "admin"
private const val PASSWORD = "123456"

const val KEY_EXTRA_USERNAME = "username"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListener()
    }

    private fun initListener() {
        binding.buttonLogin.setOnClickListener {
            val username = binding.editTextUsername.text.toString().trim()
            val password = binding.editTextPassword.text.toString().trim()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please enter both username and password", Toast.LENGTH_SHORT)
                    .show()
            } else {
                if (username == USERNAME && password == PASSWORD) {
                    val intent = Intent(this, WelcomeActivity::class.java)
                    intent.putExtra(KEY_EXTRA_USERNAME, username)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}