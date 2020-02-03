package com.cjt.kotlin


fun main(args: Array<String>) {

    var arr = listOf<String>("hello", "cjt", "yzy", "jimmy")

    for (str in arr) {
        println(str)
    }
    println("----")
    when {
        "cjt" in arr -> println("welcome cjt")
    }

    println("----")
    //it 是语法糖
    arr.filter { it.length >3 }.map { it.toUpperCase() }.forEach { println(it) }

}
