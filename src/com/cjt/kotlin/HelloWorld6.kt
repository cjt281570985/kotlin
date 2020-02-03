package com.cjt.kotlin


fun main(args: Array<String>) {

    var arr: IntArray = intArrayOf(1, 2, 3, 4, 5)

    for (value: Int in arr) {
        println(value)
    }
    println("-----------------")
    for (v in arr) {
        println(v)
    }
    println("-----------------")
    for (i: Int in arr.indices) {
        println("arr[${i}] = ${arr[i]}")
    }
    println("-----------------")
    for ((index, value) in arr.withIndex()) {
        println("arr[${index}] = ${value}")
    }

}

