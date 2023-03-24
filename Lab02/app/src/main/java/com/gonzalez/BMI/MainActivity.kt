package com.gonzalez.BMI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
        calculateBMI()

    }
    private lateinit var weightEditText: EditText
    private lateinit var heightEditText: EditText
    private lateinit var calculateButton: Button
    private lateinit var bmiTextView: TextView
    private lateinit var healthTextView: TextView
    
    private fun bind() {
        weightEditText = findViewById(R.id.weight_edit_text)
        heightEditText = findViewById(R.id.height_edit_text)
        calculateButton = findViewById(R.id.calculate_button)
        bmiTextView = findViewById(R.id.bmi_text_view)
        healthTextView = findViewById(R.id.health_text_view)
  }
    private fun calculateBMI(weight: Int, height: Int  ) : Float = weight.toFloat() / height.toFloat().pow(2)

    private fun clasificacionBMI( BMI : Double){
       if (BMI < 18.5){
           return
       }
    }

}


