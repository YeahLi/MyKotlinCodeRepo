package com.henry.rangeAndArray

fun main() {
    val array1 = arrayOf("Hello","World")
    println(array1.joinToString(" "))
    val array2:Array<String?> = arrayOfNulls<String>(5)
    array2[0] = "Hello"


    val arrInt = intArrayOf(1, 2, 3, 4, 5)
    // Array of int of size 5 with values [0, 0, 0, 0, 0]
    val arrInt1 = IntArray(5)

    // e.g. initialise the values in the array with a constant
    // Array of int of size 5 with values [42, 42, 42, 42, 42]
    val arrInt2 = IntArray(5) { 42 }

    // e.g. initialise the values in the array using a lambda
    // Array of int of size 5 with values [0, 1, 2, 3, 4] (values initialised to their index value)
    var arrInt3 = IntArray(5) { it * 1 }

    var arr = intArrayOf(1,3,5,7)
    println(arr.size)
    println(arr[2])
    arr[2] = 4

    println(arr.slice(2..3))

    for (num in arr){
        print("$num ")
    }
    println()
    for (elem in arr.withIndex()){
        println("${elem.index} -> ${elem.value}")
    }

    arr.forEach ({ num -> print("$num ") })
    println()
    arr.forEach { num -> print("$num ") }
    println()
    arr.forEach{print(it)}
    println()
    arr.forEach(::print)

}