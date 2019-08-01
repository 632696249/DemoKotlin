package com.demokotlin.`class`.other

import java.text.SimpleDateFormat
import java.util.*

//模板类
class River<T>(var name: String, var length: T) {
    fun getInfo(): String {
        var unit: String = when (length) {
            is String -> "米"
            is Number -> "m"
            else -> ""
        }
        return "${name}的长度是$length$unit"
    }

    //River<Int>("小溪",100)
    //River<Double>("大河","一千")

    /**
     * 泛型函数
     */
    fun<T> appendString(tag:String,vararg otherInfo:T?):String{
        var str:String="$tag"
        for (item in otherInfo) {
            str="$str${item.toString()}"
        }
        return str
    }

    //appendString("四大发明","造纸术","印刷术","火药","指南针")

    /**
     * 内联函数
     */
    inline fun<reified T:Number> setArrayStr(array:Array<T>){
        var str:String="数组元素依次排列:"
        for (item in array) {
            str=str+item.toString()+","
        }
    }

    /**
     * 简化函数
     */
        fun factorial(n:Int):Int=if(n<=1) n else n*factorial(n-1)

    /**
     * 尾递归函数
     */
    tailrec  fun findFixPoint(x:Double=1.0):Double=if (x==Math.cos(x)) x else findFixPoint(Math.cos(x))

    /**
     * 扩展函数
     */
    fun<T> Array<T>.swap(pos1:Int,pos2:Int){
        val tmp=this[pos1]
        this[pos1]=this[pos2]
        this[pos2]=tmp
    }

    /**
     * 日期时间函数
     */
    fun Date.gteNowDataTime():String{
        val sdf=SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        return sdf.format(sdf)
    }
}