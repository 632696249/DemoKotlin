package com.demokotlin.`class`.`interface`

interface Behavior{
    fun swim():String

    fun run():String{
        return "与Java的区别在于,Kotlin接口内部允许实现方法"
    }

    //kotlin的接口允许声明抽象属性,实现该接口的类必须重载该属性
    var skilledSports:String
}