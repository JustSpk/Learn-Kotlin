package com.justspk.learnkotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var greeting:String ="Hello Kotlin"
    private val developer="Spk"
    private val app: Int? = null
    private val name: String? = null

    @SuppressLint("WrongConstant", "ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("testing", name?.length.toString())
        Log.e(greeting,developer+"created"+app)

        Toast.makeText(this,developer,3000).show()

        val array= mutableListOf("a","b")
        array.add("")
        array.remove("a")
        array.clear()

        val map= mapOf("one" to 1,"two" to 2)
        val duplicateMap=map.toMutableMap()
        map["one"]
        val one = map.getValue("one")
        duplicateMap["three"] = 3

        for (card in duplicateMap){
            println(card)
        }

        for (i in 0 downTo duplicateMap.size){
            print(i)
        }

        for (x in 1..map.size){
            print(array)
        }

        val hai=10
        val bye=0
        val status= map.getValue("one") > map.getValue("two")

        when(hai){
                10 -> {
                    print("one")
                    print("two")
                }
            else -> print("nothing")
        }

        val value:String= ""
    }

    fun printMyScreen(){
        println("hai this is function with no parameters")
    }

    fun printParam(name: String, age: Int) {
        println(getPrint(name, age))
        val obj=Speak(name, age)
        obj.speak()
    }

    fun getStringLength(obj: Any):Int? {
        if (obj is String)
            return obj.length
        return null
    }

    private fun getPrint(name: String, age: Int):String ="Hi i'm $name, and my age is $age"

    class Speak(name: String,age: Int){
        fun speak(){
            print("")
        }
    }
}