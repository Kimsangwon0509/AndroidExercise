package com.example.firstexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.firstexercise.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val bind1 = ActivityMainBinding.inflate(layoutInflater)//함수에 전달되는 layoutinflater 는 MAinactivitiy가 가지고 있다.
        setContentView(bind1.root)
        bind1.btnSay.setOnClickListener{
            bind1.textSay.text = "kimsangwon"
            var a = mutableListOf("a","b","b","c")
            for (i in 0..3){
                println(a[i])
            }
            for(abc in a){
                print(">>>>>>>>>>>>>")
                print(abc)
                print(">>>>>>>>>>>>>")
            }
        }
        Log.d("D 로그","로그를 출력합니다.method = Log.d")

        var mutableList = mutableListOf<String>("MON","TUE","WED")
        mutableList.add("THU")
        println(mutableList)
        Log.d("태그","${mutableList.get(0)}")
        Log.d("","${mutableList.get(1)}")

        var stringList = mutableListOf<String>()
        stringList.add("월")
        stringList.add("화")
        stringList.add("수")

        stringList.set(1,"월요일")

        for(index in 0 until stringList.size){
                println(stringList.get(index))
        }

        for (index in 0..stringList.size step 2){
            println(stringList.get(index))
        }

        for(index in stringList.size downTo 0){
            println(stringList.get(index))
        }

    }
}