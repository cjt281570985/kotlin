package com.cjt.kotlin

fun main(args: Array<String>) {
    println(conver2Int("cjt"))
    println("----------")
    kk("2", "3")
    println("----------")
    mm("5", "3")
}

fun conver2Int(str: String): Int? { //?表示返回值可为空
    try {
        return str.toInt()
    } catch (ex: NumberFormatException) {
        return null
    }
}

fun kk(a: String, b: String) {
    val aa = conver2Int(a);
    val bb = conver2Int(b);

    //println(aa * bb)
    if (aa != null && bb != null) {
        println(aa * bb)
        println("----3------")
    } else {
        println("参数有可能为null")
    }
}

fun mm(a: String, b: String) {
    val aa = conver2Int(a);
    val bb = conver2Int(b);

    //println(aa * bb)
    if (aa == null) {
        println("参数有可能为null")
    } else if (bb == null) {
        println("参数有可能为null")
    } else {
        println(aa * bb)
    }
}