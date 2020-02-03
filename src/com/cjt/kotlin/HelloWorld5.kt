package com.cjt.kotlin


fun main(args: Array<String>) {

    println(con2Str(33))
    println(con2Str("sss"))
}


fun con2Str(x: Any): String? {
    if (x is String) {
        return x.toUpperCase();
    }
    return null
}