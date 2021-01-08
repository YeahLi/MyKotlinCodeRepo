package com.henry

open class Person(var name:String, var age:Int){
    init{
        println("new了一个person, 名字$name, 年龄$age")
    }
}

class Student(name:String, age: Int): Person(name, age)

fun main(){
    val student:Student = Student("Henry", 31);
}