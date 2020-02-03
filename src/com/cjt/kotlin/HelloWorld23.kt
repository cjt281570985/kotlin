package com.cjt.kotlin

class MyExtensionProperty

//类属性扩展
val MyExtensionProperty.name: String
    get() = "hello"

fun main(args: Array<String>) {
    var p = MyExtensionProperty();
    println(p.name)
}