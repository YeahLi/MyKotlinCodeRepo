package com.henry.functions

fun sum(arg1:Int, arg2:Int):Int {
    return arg1 + arg2
}

val sum2 = fun(arg1:Int, arg2:Int):Int {
    return arg1 + arg2
}

val sum3 = {arg1:Int, arg2:Int -> arg1+arg2 }

fun hello(string: String="Hello", string2:String, vararg  ints:Int){
    println(string)
    println(string2)
    ints.forEach(::println)
}

fun main() {
    val array = intArrayOf(1,2,3,4,5)
    hello(string2 = "World", ints = *array)
}