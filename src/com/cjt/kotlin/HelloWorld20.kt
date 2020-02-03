package com.cjt.kotlin

class People(address: String, name: String) {
    val age: Int
        get() = 20 //这样实际是简写

    /**
     * backing field 支撑字段(域)
     * backing property 支撑属性 (某个属性为私有变量,通过另一公开属性来访问)
     */
    var address: String = address
        get() {
            println("get address invoked")
            return field
        }
        set(value) {
            println("set address invoke")
            field = value
        }
    var name: String = name //以下2行为缺省方式,直接省略不写
        //get() {return field}
        //set(value) {field = value}
}

fun main(args: Array<String>) {
    var p = People("广东", "李小龙")
    println(p.address)
    println(p.age)

    p.address = "北京"
    println(p.address)
}