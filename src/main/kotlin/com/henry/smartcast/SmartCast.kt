package com.henry.smartcast

open class Base
class SubClass:Base() {
    fun show() {
        println("This is child instance")
    }
}

fun demo(obj:Base){
    val sub:SubClass = obj as SubClass
    sub.show()
}

fun main(){
    demo(Base())
    demo(SubClass())
}