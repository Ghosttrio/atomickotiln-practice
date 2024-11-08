//class WithCompanion {
//    companion object {
//        val i = 3
//        fun f() = i * 3
//    }
//    fun g() = i + f()
//}
//
//fun WithCompanion.Companion.h() = f() * i
//
//fun main() {
//    WithCompanion().g()
//    WithCompanion.i
//    WithCompanion.f()
//    WithCompanion.h()
//}


class Numbered2

private constructor(private val id: Int) {
    override fun toString(): String {
        return "#$id"
    }
    companion object Factory {
        fun create(size: Int) = List(size) {Numbered2(it)}
    }
}

fun main() {
    Numbered2.create(5)
}
