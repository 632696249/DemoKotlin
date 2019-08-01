package com.demokotlin.`class`.abstract

import com.demokotlin.`class`.implement.Bird

//子类的构造函数原来的输入参数不用加var和val,新增的输入参数必须加var或val
//因为抽象类不能直接使用,所以构造函数不必给默认参数赋值
abstract class Chicken(name:String,sex:Int,var voice:String): Bird(name,sex){
    val numberArray: Array<String> = arrayOf("一", "二", "三", "四", "五")

    abstract fun callOut(times:Int):String
}
