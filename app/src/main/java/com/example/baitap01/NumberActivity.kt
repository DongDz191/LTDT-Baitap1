package com.example.baitap01

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.sqrt

class NumberActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number)

        // Tham chiếu các thành phần giao diện
        val numInput: EditText = findViewById(R.id.numInput)
        val checkButton: Button = findViewById(R.id.checkButton)
        val resultText: TextView = findViewById(R.id.resultText)

        val numbers = arrayListOf(1, 2, 3, 4, 5, 10, 11, 13, 17, 19)

        // Kiểm tra và in ra các số nguyên tố trong mảng
        for (number in numbers) {
            if (isPrime(number)) {
                Log.d("PrimeNumbers", "$number là số nguyên tố")
            }
        }

        // Xử lý sự kiện nhấn nút Button
        checkButton.setOnClickListener {
            val numString = numInput.text.toString()
            if (numString.isNotEmpty()) {
                val num = numString.toInt()
                val perfectSquares = findPerfectSquares(num)

                // Hiển thị các số chính phương trong TextView
                resultText.text = "Các số chính phương: $perfectSquares"

                // Hiển thị thông báo Toast
                Toast.makeText(this, "Các số chính phương đã được hiển thị.", Toast.LENGTH_SHORT).show()
            } else {
                // Thông báo lỗi nếu không có giá trị nhập vào
                Toast.makeText(this, "Vui lòng nhập một số", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Hàm kiểm tra số nguyên tố
    private fun isPrime(number: Int): Boolean {
        if (number <= 1) return false
        for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
            if (number % i == 0) return false
        }
        return true
    }

    // Hàm kiểm tra số chính phương
    private fun findPerfectSquares(limit: Int): List<Int> {
        val perfectSquares = mutableListOf<Int>()
        for (i in 1..limit) {
            val sqrtValue = sqrt(i.toDouble()).toInt()
            if (sqrtValue * sqrtValue == i) {
                perfectSquares.add(i)
            }
        }
        return perfectSquares
    }
}
