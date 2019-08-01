package com.demokotlin.`class`.`interface`

import com.demokotlin.`class`.implement.Bird

class Goose(name:String="鹅",sex:Int= Bird.MALE): Bird(name,sex), Behavior {
    override fun swim(): String {
       return "测试数据"
    }

    override var skilledSports: String="游泳"

}