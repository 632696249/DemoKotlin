package com.demokotlin.`class`.other

sealed class SeasonSealed{
    //密封类内部的每个嵌套类都必须继承
    class Spring(var name:String):SeasonSealed()
    class Summer(var name:String):SeasonSealed()
    class Autumn(var name:String):SeasonSealed()
    class Winter(var name:String):SeasonSealed()
}