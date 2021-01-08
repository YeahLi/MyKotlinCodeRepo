package com.henry.rangeAndArray

fun main() {
    val closedRange = 1..10
    val halfOpenRange = 1 until 10
    val emptyRange = 0..-1

    println(5 in closedRange)

    for (i in closedRange){
        println(i)
    }
}