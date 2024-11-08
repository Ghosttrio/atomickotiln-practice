interface LibType {
    fun f1()
    fun f2()
}

fun utility1(lt: LibType) {
    lt.f1()
    lt.f2()
}
fun utility2(lt: LibType) {
    lt.f1()
    lt.f2()
}

open class MyClass {
    fun g() = println("g()")
    fun h() = println("h()")
}

fun useMyClass(mc: MyClass) {
    mc.g()
    mc.h()
}

class MyClassAdaptedForLib : MyClass(), LibType {
    override fun f1() {
        TODO("Not yet implemented")
    }

    override fun f2() {
        TODO("Not yet implemented")
    }

}



//class Z(var i: Int = 0) {
//    private var j = 0
//}
//
//fun Z.decrease() {
//    j-- // 접근 불가
//}
