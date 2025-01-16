package com.example.baitap01

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PrimeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prime)  // Đảm bảo bạn đã tạo layout cho activity này

        val inputNumbers: EditText = findViewById(R.id.inputNumbers)
        val checkButton: Button = findViewById(R.id.checkButton)
        val resultText: TextView = findViewById(R.id.resultText)

        checkButton.setOnClickListener {
            val inputText = inputNumbers.text.toString()
            if (inputText.isNotEmpty()) {
                val numbers = inputText.split(",").map { it.trim().toIntOrNull() }.filterNotNull()
                val primeNumbers = findPrimeNumbers(numbers)

                resultText.text = "Các số nguyên tố: ${primeNumbers.joinToString(", ")}"

                primeNumbers.forEach {
                    Log.d("PrimeNumbers", "$it là số nguyên tố")
                }

                Toast.makeText(this, "Các số nguyên tố đã được hiển thị", Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(this, "Vui lòng nhập các số", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun findPrimeNumbers(numbers: List<Int>): List<Int> {
        return numbers.filter { isPrime(it) }
    }

    private fun isPrime(number: Int): Boolean {
        if (number <= 1) return false
        for (i in 2 until number) {
            if (number % i == 0) return false
        }
        return true
    }
}
