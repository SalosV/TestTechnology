package com.santiagolozada.testapplication.onboarding

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.santiagolozada.testapplication.R
import com.santiagolozada.testapplication.databinding.ActivityWelcomeBinding
import com.santiagolozada.testapplication.login.KEY_EXTRA_USERNAME

class WelcomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra(KEY_EXTRA_USERNAME)
        binding.textViewWelcomeUser.text = getString(R.string.welcome_user, username)
    }
}