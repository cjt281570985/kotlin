package com.cjt.kotlin

open class Fruits {
    open val name : String = "fffff"
    open fun name() {
        println("fruit")
    }
    fun eat() {
        println("eat fruit")
    }
}

class App: Fruits(){
    override val name: String
        get() = super.name + "aab"
    override fun name() {
        println("apple")
    }

}

fun main(args: Array<String>) {
    var a = App()
    a.name()
    a.eat()
    println(a.name)
}