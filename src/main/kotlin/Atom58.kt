open class Base {
    open fun test() {
        println("base test")
    }
}

class Derived1: Base() {
    override fun test() {
        println("derived1 test")
    }
}

class Derived2: Base() {
    override fun test() {
        super.test()
        println("derived2 test")
    }
}

fun ttt(base: Base) {
    base.test()
}


fun main() {
    ttt(Derived1())
    ttt(Derived2())
}
