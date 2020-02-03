package com.cjt.kotlin

//对象声明
object MyObject {
    fun method() {
        println("method")
    }
}

fun main(args: Array<String>) {
    MyObject.method()
    println("--------------------------------")
    MyTest.MyObject.method()
    println(MyTest.MyObject.a)
    println("--------------------------------")
    MyTest.method() //类似java静态方法, kotlin中没有静态方法
    println(MyTest.a)
    println("--------------------------------")
    var v = MyTest.MyObject;
    println(v.javaClass) //class com.cjt.kotlin.MyTest$MyObject
}

/**
 * compainon object 伴生对象 (随着类的存在而存在)
 * 在kotlin中,类是没有static方法
 * 在大多数情况下,kotlin推荐的做法是使用包级别的函数来作为静态方法
 * kotlin会将包级别的函数当做静态方法来看待
 */

class MyTest {
    /**
     * 在一个类中,只允许出现一个伴生对象
     * 伴生对象名字MyObject可省略, 那么编译器会生成一个默认名字Companion
     * 注意: 虽然伴生对象的成员看起来像是java中的静态成员,但在运行期,他们是真实对象的实例成员
     * 在JVM上,可以将伴生对象的成员真正生成为类的静态方法与属性,这是通过@JvmStatic注解来实现的
     */
    companion object MyObject {
        var a:Int = 100

        //通过字节码分析 9
        @JvmStatic //此注解只是在反编译时可查看,不加对代码执行无区别
        fun method() {
            println("method invoked!")
        }
    }
}


class D {
     companion object {

         @JvmStatic
         fun foo() {

         }

         fun bar() {

         }
     }
}