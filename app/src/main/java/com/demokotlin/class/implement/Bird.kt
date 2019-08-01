package com.demokotlin.`class`.implement
//开放修饰符4种:public,internal,protected,private
open class Bird(var name:String,val sex:Int=0){
    val sexName:String
    init {
        sexName=getSexName(sex)
    }

    open protected fun getSexName(sex: Int):String{
        return if (sex== MALE) "公" else "母"
    }

    companion object {
        val MALE=0
    }
}