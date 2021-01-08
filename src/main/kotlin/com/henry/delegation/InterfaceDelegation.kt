package com.henry.delegation

interface Drive{
    fun drive()
}

interface Write{
    fun writePPT()
}

class SeniorManager(val driver:Drive, val writer:Write): Drive by driver, Write by writer

class Driver(val name:String):Drive{
    override fun drive() {
        println("$name is driving a car")
    }
}

class Writer(val name:String):Write{
    override fun writePPT() {
        println("$name is making PPT")
    }
}

fun main() {
    val manager = SeniorManager(Driver("henry"), Writer("whitney"))
    manager.drive()
    manager.writePPT()
}