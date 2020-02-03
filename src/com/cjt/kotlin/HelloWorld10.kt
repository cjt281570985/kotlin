package com.cjt.kotlin


fun main(args: Array<String>) {
    var a: String = "hello \n world"
    println(a) //输出会换行

    //用三个""" 将整串字符串保持原样
    var b: String = """hello \n world"""
    println(b) ////输出不会换行
}
