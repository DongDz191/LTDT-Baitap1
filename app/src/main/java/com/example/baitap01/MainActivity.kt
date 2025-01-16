package com.example.baitap01

import android.app.Activity
import android.content.Intent
import android.os.Bundle

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import de.hdodenhof.circleimageview.CircleImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.sqrt

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Tham chiếu các thành phần giao diện
        val studentImage: CircleImageView = findViewById(R.id.studentImage)
        val studentName: TextView = findViewById(R.id.studentName)
        val studentClass: TextView = findViewById(R.id.studentClass)
        val studentId: TextView = findViewById(R.id.studentId)
        val goToNumberActivityButton: Button = findViewById(R.id.goToNumberActivityButton)
        val goToPrimeActivityButton: Button = findViewById(R.id.goToPrimeActivityButton)

        // Cập nhật dữ liệu sinh viên (nếu cần)
        studentName.text = "Hồ Phương Đông"
        studentClass.text = "Lớp: 21110ST1A"
        studentId.text = "Mã SV: 21110424"

        goToNumberActivityButton.setOnClickListener {
            val intent = Intent(this, NumberActivity::class.java)
            startActivity(intent)
        }

        goToPrimeActivityButton.setOnClickListener {
            val intent = Intent(this, PrimeActivity::class.java)
            startActivity(intent)
        }
    }
}