package com.example.mylibrary

import android.util.Log

class MyLog {
    companion object{
        fun d(msg:String){
            Log.d("MyLog",msg)
        }
        fun add(a:Int = 0,b:Int=0) = a+b
    }
}