package com.demokotlin

import android.content.Context
import org.jetbrains.anko.toast

class AnimalMain  @JvmOverloads constructor(context: Context, name:String){
    //一级构造函数(可以没有)
    init {
        context.toast("这是只$name")
    }

    //二级构造函数
    constructor(context: Context, name: String, sex: Int) : this(context, name){
        var sexName:String=if (sex==0) "公" else "母"
        context.toast("这只${name}是${sexName}的")
    }

}
