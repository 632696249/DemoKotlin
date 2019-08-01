package com.demokotlin.`class`.abstract

import com.demokotlin.`class`.implement.Bird

class Cock(name:String="鸡", sex:Int= Bird.MALE, voice:String="喔喔喔"): Chicken(name,sex,voice){
    override fun callOut(times: Int): String {
        var count=when{
            times<=0 ->0
            times>=10 ->9
            else ->times
        }
        return "$count"
    }

}