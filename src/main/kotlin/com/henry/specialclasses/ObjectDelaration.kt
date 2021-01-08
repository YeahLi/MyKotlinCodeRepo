package com.henry.specialclasses

//伴生对象回顾
class MathUtils{
    companion object Math{
        @JvmStatic
        fun minOf(x:Int, y:Int):Int{
            return if (x<=y) x else y
        }
        const val DESCRIPTION = "This is a Math utility class"
        @JvmField
        var numberOfCalls = 0
    }
}

//转写成object class
object MathUtils2{
    fun minOf(x:Int, y:Int):Int{
        return if (x<=y) x else y
    }
    const val DESCRIPTION = "This is a Math utility class"
    var numberOfCalls = 0
}