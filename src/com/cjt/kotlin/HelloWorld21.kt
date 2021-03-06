package com.cjt.kotlin

/**
 * 延迟初始化属性
 * Kotlin要求非空类型的属性必须要在构造方法中进行初始化
 * 有时这种要求不太方便,那可以通过依赖注入或是单元测试情况下进行属性赋值
 *
 * 通过lateinit关键字标识属性为延迟初始化,要满足3个条件:
 * 1.lateinit只能用在类声明的var属性上,不能用在primary constructor声明的属性上
 * 2.属性不能拥有自定义的setter与getter
 * 3.属性类型需要非空,且不能是原生数据类型(如: 不能是 Int)
 */
class LateClass {

    lateinit var name: String

    fun init() {
        this.name = "李小龙"
    }

    fun info() {
        println(this.name)
    }

}

fun main(args: Array<String>) {
    var late = LateClass()

    //lateinit property name has not been initialized
    late.init() //此行若注释掉的话会产生异常

    late.info()
}
