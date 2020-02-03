package com.cjt.kotlin


fun main(args: Array<String>) {

    var a = 5
    var b = 10

    for (i in a..b) {
        println(i)
    }
    println("------")
    for (i in 7..b) {  //[7, 10]
        println(i)
    }
    println("------")
    for (i in 7.rangeTo(9)) { //[7, 9]
        println(i)
    }
    println("------")
    for (i in 2.rangeTo(9) step 2) {
        println(i)
    }
    println("------")
    for (i in 10 downTo 2 step 3) {
        println(i)
    }
}
