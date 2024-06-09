package com.tanveer.mycode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.tanveer.mycode.R.*

class MainActivity : AppCompatActivity() {

   var etContactNumber: EditText?= null
    var button: EditText?= null
    var rbYES: RadioButton?= null
    var rbNO: RadioButton?= null
    var etStudyField : EditText?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }

        etContactNumber = findViewById(R.id.etContactNumber)
        button = findViewById(R.id.Button)
        rbYES = findViewById(R.id.rbYES)
        rbNO = findViewById(R.id.rbNO)
        etStudyField = findViewById(R.id.etStudyField)
        button?.setOnClickListener {
            if (etContactNumber?.text.toString().trim().isNullOrEmpty()) {
                etContactNumber?.error = "Enter your number"
            } else if (etContactNumber?.text.toString().trim().length < 10) {
                etContactNumber?.error = "enter a valid 10-digits number"
            } else (){
                Toast.makeText(this, "saved successfully", Toast.LENGTH_SHORT).show()
            }

        }
        button?.setOnClickListener {
            if (etStudyField?.text.toString().trim().isNullOrEmpty()) {
                etStudyField?.error = "enter your field"

            } else (){
                Toast.makeText(this, "saved successfully", Toast.LENGTH_SHORT).show()
            }
            rbYES?.setOnClickListener {}
            rbYES?.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    etStudyField?.visibility = View.VISIBLE
                } else {
                    etStudyField?.visibility = View.GONE
                }
            }
        }
    }




