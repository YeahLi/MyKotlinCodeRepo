package com.henry.variables

fun main() {
    //1. val and var
    val a = 3
    var b = 3
    //a=5;
    // Compiler error: Val cannot be reassigned

    //2. variable must be initialized before use
    var c:Int
    //print(c)
    //Compiler error: Variable 'c' must be initialized

    //使用前只要初始化过就行
    val d: Int  // 1
    if (true) {
        d = 1   // 2
    } else {
        d = 2   // 2
    }
    println(d)

    //3. Variable cannot be assigned as null. If you need to use null, add suffix ?
    var neverNull: String = "This can't be null"
    //neverNull = null //Compiler error

    var nullable: String? = "You can keep a null here"
    nullable = null

    //var str: String = nullable //Compiler error
    var str = nullable ?: "Default"
    var strNull: String? = nullable

    if (nullable!=null){
        str = nullable
    }

    //val len = nullable.length //Compiler error
    var len2 = nullable?.length
    //val len3 = nullable!!.length

    //4. 类型infer
    val myStr = "Hello" //infer to String
}