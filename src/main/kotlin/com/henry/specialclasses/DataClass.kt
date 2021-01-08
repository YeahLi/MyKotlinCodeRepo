package com.henry.specialclasses

data class User(val name:String, val id:Int)

fun main() {
    val user = User("Alex", 1)
    println(user) //User(name=Alex, id=1)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")   // true
    println("user == secondUser: ${user === secondUser}")  // false
    println("user == thirdUser: ${user == thirdUser}")     // false

    println(user.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    println(user.copy())            //User(name=Alex, id=1)
    println(user.copy("Max")) //User(name=Max, id=1)
    println(user.copy(id = 2))      //User(name=Alex, id=2)

    println("name = ${user.component1()}") //name = Alex
    println("id = ${user.component2()}")   //id = 1
}