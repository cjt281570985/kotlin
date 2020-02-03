package com.cjt.kotlin


//直接将类的成员变量属性定义在类的构造参数上
class Student (private var name: String, private var age: Int)  {

    fun printInfo() {
        println("name: $name, age: ${age}")
    }
}


/**
 * 如果构造方法拥有注解或是可见性修饰符,那个constructor不能省略
 */
class Student2 private constructor( var name: String)  {

}

/**
 * 在JVM上,如果类的primary构造方法的所有参数都拥有默认值,那么kotlin编译器就会为这个类生成一个不带参数的构造方法
 * 这个不带参数的构造方法会使用这些参数的默认值,这样做的目的在于可以与spring等框架更好地集成
 */
class Student3 ( var name: String = "李小龙")  {

}


fun main(args: Array<String>) {
    var stu = Student("cjt", 32)
    stu.printInfo()

    var stu3 = Student3();
    var stu33 = Student3("云中月");
    println(stu3.name)
    println(stu33.name)
}