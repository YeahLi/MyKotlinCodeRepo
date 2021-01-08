package com.henry.expansion

import java.lang.StringBuilder

fun String.multiply(int: Int):String {
    val stringBuilder = StringBuilder()
    for (i in 1..int){
        stringBuilder.append(this)
    }
    return stringBuilder.toString()
}

fun main() {
    println("*".multiply(16))
}