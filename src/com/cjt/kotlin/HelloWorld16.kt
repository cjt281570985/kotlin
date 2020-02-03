package com.cjt.kotlin

//属性继承,重写
open class MyParent {
    open val name: String = "jimmy"
}

class MyChild: MyParent() {
    override val name: String = "cjt"
}

class MyChild2(override var name: String): MyParent() {

}
/** var相当于既有get() 又有set()属性, val相当于只有get()
 * val 可以 override val
 * var 可以 override val
 * val 不可以 override var
 */
open class MyParent3 {
    open fun method() {
        println("parent method")
    }
    open val name: String get() = "jimmy"
}

class MyChild3: MyParent3() {
    override fun method() {
        super.method()
        println("child method")
    }
    override val name: String
        get() = super.name + " and child"
}

fun main(args: Array<String>) {
    var myChild = MyChild()
    println(myChild.name)

    var myChild2 = MyChild2("李小龙")
    println(myChild2.name)

    println("-------------------")

    var myChild3 = MyChild3();
    myChild3.method()
    println(myChild3.name)
}












