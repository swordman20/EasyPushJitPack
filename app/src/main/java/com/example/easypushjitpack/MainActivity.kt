package com.example.easypushjitpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.MyLog
import com.example.mylibrary.Student

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val student = Student("张三", 18, "男")
        MyLog.d(student.toString())
        MyLog.add(5)
    }
}