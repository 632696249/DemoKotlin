package com.demokotlin.`class`.implement

class Duck(name:String="鸭子",sex:Int= MALE) : Bird(name,sex) {
    override fun getSexName(sex: Int): String {
        return if(sex== MALE) "雄" else "雌"
    }
}