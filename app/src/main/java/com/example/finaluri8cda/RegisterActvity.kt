package com.example.finaluri8cda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class RegisterActvity : AppCompatActivity() {
    private lateinit var  editTextEmailAddress : TextView
    private lateinit var  editTextPasswordRegister: TextView
    private lateinit var  buttonRegister2 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_actvity)
        init()
        registerListeners()
    }


    private fun init() {
        editTextEmailAddress = findViewById(R.id.editTextEmailAddress)
        editTextPasswordRegister = findViewById(R.id.editTextPasswordRegister)
        buttonRegister2 = findViewById(R.id.buttonRegister2)
    }
    private fun registerListeners() {
        buttonRegister2.setOnClickListener{
            val email = editTextEmailAddress.text.toString()
            val password = editTextPasswordRegister.text.toString()

            if (email.isEmpty() || password.isEmpty()){
                Toast.makeText(this, "empty!", Toast.LENGTH_SHORT).show()
            }
            FirebaseAuth.getInstance()
                .createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                        finish()
                    } else {
                        Toast.makeText(this, "Error!", Toast.LENGTH_SHORT).show()
                    }
                }
        }


    }
}