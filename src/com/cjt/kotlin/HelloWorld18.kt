package com.cjt.kotlin


open class BaseClass {

    open fun method() {

    }
}

//子类可以用抽象方法来override父类方法
abstract class ChildClass: BaseClass() {
    override abstract fun method()
}