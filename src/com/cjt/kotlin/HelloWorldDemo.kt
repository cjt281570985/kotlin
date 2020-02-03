package com.cjt.kotlin

import java.util.function.Consumer

fun main(args : Array<String>) {
    //println("Hello World");
    var list: List<String> = listOf("cjt", "jimmy", "yzy")   //后面可以不加分号

    for (str in list) {
        println(str)
    }

    println("-----------")

    list.forEach { println(it) }

    println("-----------")

    list.forEach(Consumer { println(it) })

    println("-----------")

    list.forEach(System.out::println)


}