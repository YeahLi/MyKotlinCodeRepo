package com.henry.oop

class MathUtils{
    companion object Math{
        @JvmStatic
        fun minOf(x:Int, y:Int):Int{
            return if (x<=y){
                x
            }else{
                y
            }
        }

        const val DESCRIPTION = "This is a Math utility class"

        @JvmField
        var numberOfCalls = 0
    }
}

fun main() {
    val min = MathUtils.minOf(5, 7)
    val min2 = minOf(5, 7) //不需要使用Math.min(), kotlin可以直接调用方法
}