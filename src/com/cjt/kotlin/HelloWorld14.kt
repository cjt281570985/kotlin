package com.cjt.kotlin

//继承

//在Kotlin中,所有类在默认情况下都是无法被继承的, 默认情况下都是final
//open的含义与final相反

open class Parent(name: String, age: Int) {

}

class Child(name: String, age: Int) : Parent(name, age) {

}

open class Parent2(name: String) {

}

//在Kotlin中, 如果一个类没有primary构造方法,那么这个类的每个secondary构造方法
//就需要通过super关键字来初始化父类型,或是通过其他secondary构造方法完成这个任务.
//不同的secondary可以调用父类型不同的构造方法
class Child2: Parent2 {
    constructor(name: String): super(name) {

    }
}