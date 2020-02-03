package com.cjt.kotlin

fun main(args: Array<String>) {
    var x = 10
    var y = 20

    var max = if(x > y) x else y
    var min = if(x > y) y else x

    println("max = $max, min = $min")

    //{...} 返回表达式最后一个语句的值
    var max1 = if (x > y) {
        println("x > y")
        x
    } else {
        println("x <= y")
        y
    }

    var min1 = if (x > y) {
        println("x > y")
        y
    } else {
        println("x <= y")
        x
    }
    println("max = $max1, min = $min1")
}
