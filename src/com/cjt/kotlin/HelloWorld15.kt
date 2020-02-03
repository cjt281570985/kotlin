package com.cjt.kotlin

open class Fruit {
    open fun name(){
        println("fruit")
    }
    fun eat(){
        println("eat fruit")
    }
}

class Apple: Fruit() {
    override fun name() {
        println("apple")
    }
}

class Orange: Fruit() {
    //禁止子类重写
    final override fun name() {
        println("orange")
    }
}

fun main(args: Array<String>) {
    var apple = Apple();
    apple.name() //apple
    apple.eat() //eat fruit
}