package com.cjt.kotlin

/**
 * 扩展的作用域
 * 1.扩展函数所定义在的类实例叫做分发接收者(dispatch receiver)
 * 2.扩展函数所扩展的那个类的实例叫做扩展接收者(extension receiver)
 * 3.当以上2个名字出现冲突时,扩展接收者的优先级最高
 */
class DD { //扩展接收者
    fun method() {
        println("DD method")
    }
}

class EE { //分发接收者
    fun method2() {
        println("EE method")
    }

    //此处DD的扩展方法是在EE内部声明,不能在EE外部调用
    fun DD.hello() {
        method()
        method2()
    }

    fun world(dd: DD) {
        dd.hello()
    }

    fun DD.output() {
        println(toString()) //当以上2个名字出现冲突时,扩展接收者的优先级最高
        println("--------------------------------")
        println(this@EE.toString())
    }

    fun test() {
        var dd = DD()
        dd.output()
    }
}

/**
 * 扩展可以很好地解决Java中充斥的各种辅助类问题
 * Collections.swap(list,5,11)
 * list.swap(5, 11)
 */
fun main(args: Array<String>) {
    EE().test()
}
