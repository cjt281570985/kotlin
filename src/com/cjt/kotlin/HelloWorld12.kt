package com.cjt.kotlin

//此处 constructor 可省略
class Person constructor(name: String) {

    private var name: String
    private var age: Int
    private var address: String

    init {
        this.name = name
        this.age = 20
        this.address = "厦门"
    }

    constructor(name: String, age: Int) : this(name) {
        this.name = name
        this.age = age
        this.address = "北京"
    }

    constructor(name: String, age: Int, address: String) : this(name, age) {
        this.address = address
    }

    fun printInfo() {
        println("name: ${this.name}, age: ${this.age}, adress: ${this.address}")
        println("------------")
    }
}


fun main(args: Array<String>) {

    var p1 = Person("jimmy")
    var p2 = Person("cjt", 32)
    var p3 = Person("yzy", 35, "上海")

    p1.printInfo()
    p2.printInfo()
    p3.printInfo()
}