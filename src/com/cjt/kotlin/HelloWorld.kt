package com.cjt.kotlin

fun main(args : Array<String>) {

 println(sum(1, 2))
 println(sum2(2, 3))
    myPrint(5, 7)
    myPrint2(5, 8)
}

fun sum(a: Int, b: Int): Int {
    return a+b
}

fun sum2(a: Int, b: Int) = a + b  //语法糖

fun myPrint(a: Int, b: Int): Unit {
    println("$a + $b = ${a+b}")
}

fun myPrint2(a: Int, b: Int) {
    println("$a + $b = ${a+b}")
}