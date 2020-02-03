package com.cjt.kotlin

/**
 * 可见性 visibility
 * Kotlin提供了4种可见性修饰符: private protected internal(在同个模块可用) public(默认)
 *
 */

class ExtensionTest {
    fun add(a:Int, b:Int) = a + b
}

/**
 * 扩展的方法在字节码中是查看不到的
 * 扩展本身差不会真正修改目标类,不会在目标类插入新的属性和方法
 * 扩展函数的解析是静态分发的,而不是动态的,即不支持多态,调用只取决于对象的声明类型
 * 调用是由对象声明类型所决定的,而不是由对象的实际类型决定
 */
fun ExtensionTest.multiply(a:Int, b:Int) = a * b

fun main(args: Array<String>) {
    var en = ExtensionTest()
    println(en.add(2,5))
    println(en.multiply(2,5))
    println("--------------------------------")
    myPrint(AA()) //此处输出  aaa
    myPrint(BB()) //此处输出  aaa
    println("--------------------------------")
    CC().foo() //foo
    CC().foo(5) //foo - 5
}

open class AA
class BB: AA()

fun AA.info() = "aaa"
fun BB.info() = "bbb"

fun myPrint(aa: AA) {
    println(aa.info())
}

//同名方法扩展是无效的, 方法重载是可以的
class CC {
    fun foo() {
        println("foo")
    }
}

fun CC.foo() {
    println("foo222")
}
fun CC.foo(i: Int) {
    println("foo - " + i)
}

//可空类型的方法扩展
fun Any?.toString(): String {
    if (this == null) {
        return "null"
    }
    return toString()
}