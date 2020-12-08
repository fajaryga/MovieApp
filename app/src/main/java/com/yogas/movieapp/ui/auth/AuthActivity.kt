package com.yogas.movieapp.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.yogas.movieapp.R
import com.yogas.movieapp.data.model.AuthUser
import com.yogas.movieapp.databinding.ActivityAuthBinding
import com.yogas.movieapp.ui.home.MainActivity

class AuthActivity : AppCompatActivity() {
    lateinit var binding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_auth)
    }

    fun onSuccess(user: AuthUser) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}