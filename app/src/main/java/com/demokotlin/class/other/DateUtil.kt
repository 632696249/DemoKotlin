package com.demokotlin.`class`.other

import java.text.SimpleDateFormat
import java.util.*

object DateUtil{
    val nowDateTime:String
    get(){
        val sdf=SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        return sdf.format(Date())
    }

    //外部调用 DateUtil.nowDateTime
}