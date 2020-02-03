package com.cjt.kotlin

import com.cjt.kotlin2.multiply as cjt  //可设置别名

fun main(args: Array<String>) {
    val a:Int = 1
    val b = 2

    var c: Int  //var 是变量
    c = 3
    c=4

    println(c)

    var x = 10
    var y: Byte = 20

    x = y.toInt()

    println(x)

    /*
    /*
    可嵌套注释
     */
     */
    //println(multiply(3, 7))
    println(cjt(3, 7))

    val m = intArrayOf(1, 2, 3)
    //m = intArrayOf(2, 3)    //不可变,不能修改
    //只能修改引用的值
    m.set(1, 100)

    //it 是语法糖
    m.forEach { println(it) }
}
