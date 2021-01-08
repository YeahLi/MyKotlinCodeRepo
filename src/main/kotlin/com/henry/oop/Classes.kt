package com.henry.oop

class Person constructor(firstName: String)
class Person2 (firstName:String)

//only has a private constructor
class Person3 private constructor()

//parameters are used in class block and initializer blocks
class Person4(firstName:String, lastName:String, age:Int){
    val name = "$firstName $lastName"
    init{
        println("new了一个person, 名字$name")
    }
    val age = age
    init {
        println("new了一个person, 年龄${this.age}")
    }
}
//define and initialize properties in primary constructor
class Person5(firstName:String, lastName:String, val age:Int){
    val name = "$firstName $lastName"
    init{
        println("new了一个person, 名字$name, 年龄${this.age}")
    }
}

//two constructors
class Person6(var name:String, var age:Int){
    constructor(firstName:String, lastName:String, age:Int):this(firstName+lastName, age){
        println("Using secondary constructor to create an instance.")
    }
}

class Person7{
    init {
        println("Init block")
    }
    constructor(name: String) {
        println("Secondary constructor $name")
    }
}

class Person8{
    val name:String
        get() = this.name
    var age:Int
        get() = this.age
        set(value){
            this.age = value
        }
}

fun main() {
    val person:Person7 = Person7("aaaa")


}

//inherit
open class Base(p: Int)
class Derived(p: Int): Base(p)
class Dervied2: Base {
    constructor(p:Int):super(p)
    //delegate to above secondary constructor
    constructor(p:Int, q:Int):this(p){
        println(q)
    }
}

//override
open class Shape {
    open val vertexCount: Int = 0
    open fun draw() {
        println("Draw something")
    }
    fun fill() {
        println("Fill in the Shape whth some colors")
    }
}

class Triangle() : Shape() {
    override val vertexCount = 3 //override property
    override fun draw() { //override method
        println("Draw a triangle")
    }
}

open class Rectangle() : Shape() {
    override var vertexCount = 4 //override val to var
    final override fun draw() { //override method and forbid overridding by child class
        println("Draw a Rectangle")
    }
}

class Overloads{
    @JvmOverloads
    fun multiply(x:Int = 0):Int{
        return x*x
    }

    fun multiply(x:Int, y:Int):Int{
        return x*y
    }
}