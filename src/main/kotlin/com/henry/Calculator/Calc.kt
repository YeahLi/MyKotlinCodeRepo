package com.henry.Calculator

import java.lang.UnsupportedOperationException

fun main() {
    do {
        println("请输入算式如：3 + 4")
        var input = readLine()
        if (input != null){
            val splits = input.split(" ");
            val arg1 = splits[0].toDouble();
            val op = splits[1]
            val arg2 = splits[2].toDouble();
            try {
                val operator: Operator = Operator(op);
                println("$arg1 $op $arg2 = ${operator.apply(arg1, arg2)}")
            }catch (e:UnsupportedOperationException){
                println("不支持运算符：${e.message}")
            }

        }
        println("Continue?")
        input = readLine()
    }while (input == "yes")
}

class Operator(op: String){
    val opFun:(arg1:Double, arg2:Double) -> Double
    init {
        opFun = when(op){
            "+"  -> {arg1, arg2 -> arg1 + arg2}
            "-"  -> {arg1, arg2 -> arg1 - arg2}
            "*"  -> {arg1, arg2 -> arg1 * arg2}
            "/"  -> {arg1, arg2 -> arg1 / arg2}
            else -> throw UnsupportedOperationException(op)
        }
    }

    fun apply(arg1: Double, arg2: Double):Double {
        return opFun(arg1, arg2)
    }
}