package com.cjt.kotlin


fun main(args: Array<String>) {

    println(myStr("a"))
    println(myStr2("bf"))

    var a = 101
    var result = when (a) {
        1 -> {
            println("a=1")
            10
        }
        2 -> {
            println("a=2")
            20
        }
        3, 4, 5 -> {
            println("a=3,4,5")
            345
        }
        in 6..10 -> {
            println("a in 6-10")
            678910
        }
        else -> {
            println("other")
            77
        }
    }
    println(result)
}

fun myStr(x: String): String {
    when (x) {
        "a" -> return "001"
        "b" -> return "002"
        "c" -> return "003"
        else -> return "other"
    }
}

fun myStr2(x: String): String {
    return when (x) {
        "a" -> "1"
        "b" -> "2"
        "c" -> "3"
        else -> "99"
    }
}
