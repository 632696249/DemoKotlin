package com.demokotlin.`class`.other

class Tree(var treeName: String) {
    //嵌套类需要加上inner前缀
    inner class Fruit(var fruitName:String){
        fun getName():String{
            return "这是${treeName}长出来的$fruitName"
        }
    }

    //使用内部类是,必须调用外部类的构造函数,否则编译器会报错
    val peach=Tree("桃树").Fruit("桃子")
    //peach.getName()
}