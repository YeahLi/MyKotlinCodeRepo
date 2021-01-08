package com.henry.specialclasses

enum class Direction(val contorlKey:String) {
    NORTH("up"),
    SOUTH("down"),
    WEST("left"),
    EAST("right");

    fun getControlKey():String{
        return "$name => $contorlKey"
    }

    override fun toString(): String {
        return "$name, $ordinal"
    }
}

fun main() {
    val direction = Direction.NORTH
    println(direction)
    println(Direction.NORTH.getControlKey())

    //print all directions
    Direction.values().forEach(::println)
}