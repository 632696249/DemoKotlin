package com.demokotlin.`class`.by

import com.demokotlin.`class`.`interface`.Behavior
import com.demokotlin.`class`.implement.Bird

class WildFowl(name:String,sex:Int=MALE,behavior: Behavior):Bird(name,sex),Behavior by behavior{
}