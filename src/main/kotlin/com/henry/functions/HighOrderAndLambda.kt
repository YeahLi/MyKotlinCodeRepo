package com.henry.functions

import java.lang.UnsupportedOperationException

fun calculate(x:Int, y:Int, operation: (Int, Int)->Int):Int {
    return operation(x, y)
}

fun operation(doWhat:String):(Int, Int)->Int{
    when(doWhat){
        "add" -> return {x:Int,y:Int -> x+y}
        "multiply" -> return {x:Int,y:Int -> x*y}
        else -> throw UnsupportedOperationException(doWhat)
    }
}

fun main() {
    println(calculate(1,2, {x, y -> x+y}))
    println(operation("add").invoke(1,2))
    println(operation("multiply").invoke(1,2))
}
