package com.cjt.kotlin

//伴生对象扩展
class CompanionObjectExtension {
    companion object MyObject {

    }
}

fun CompanionObjectExtension.MyObject.hello() {
    println("hello kotlin")
}

fun main(args: Array<String>) {
    CompanionObjectExtension.hello()
}
