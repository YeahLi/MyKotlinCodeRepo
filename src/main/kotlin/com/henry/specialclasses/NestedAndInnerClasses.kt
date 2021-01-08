package com.henry.specialclasses
//Demo for nested class
class Outer {
    private val bar: Int = 1
    class Nested {
        fun foo() = 2
    }
}

fun main() {
    val demo = Outer.Nested().foo()
    val demo2 = Outer2().Inner()
    demo2.hello()
}

class Outer2{
    val a = 5;
    inner class Inner{
        val a = 3;
        fun hello(){
            println(this@Outer2.a)
        }
    }
}
