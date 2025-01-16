package com.example.baitap01

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.baitap01.ui.theme.Baitap01Theme
import de.hdodenhof.circleimageview.CircleImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.sqrt

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        requestWindowFeature(Window.FEATURE_NO_TITLE)
//        window.setFlags(
//            WindowManager.LayoutParams.FLAG_FULLSCREEN,
//            WindowManager.LayoutParams.FLAG_FULLSCREEN
//        )
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

        val numbers = arrayListOf(1, 2, 3, 4, 5, 10, 11, 13, 17, 19)

        // Kiểm tra và in ra các số nguyên tố trong mảng
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