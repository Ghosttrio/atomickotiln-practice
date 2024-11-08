//interface Computer {
//    fun prompt(): String
//    fun calculateAnswer(): Int
//}
//
//class Desktop : Computer {
//    override fun prompt(): String = "hello!"
//    override fun calculateAnswer(): Int = 11
//}
//
//class DeepThought : Computer {
//    override fun prompt(): String = "thinking!"
//    override fun calculateAnswer(): Int = 42
//}
//
//interface Player {
//    val symbol: Char
//}
//
//class Food : Player {
//    override val symbol: Char = '.'
//}
//class Robot: Player {
//    override val symbol: Char
//        get() = 'R'
//}
//
//interface Hotness {
//    fun feedback(): String
//}
//
//enum class SpiceLevel : Hotness {
//    Mild {
//        override fun feedback(): String = "test"
//    }
//}
//
//fun interface ZeroArg {
//    fun f(): Int
//}
//
//fun interface OneArg {
//    fun g(n: Int): Int
//}
//
//fun interface TwoArg {
//    fun h(i: Int, j: Int): Int
//}
//
//
//class VerboseZero: ZeroArg {
//    override fun f(): Int = 11
//}
//val verboseZero = VerboseZero()
//
//fun main() {
//    verboseZero.f()
//}

//fun interface Action {
//    fun act(test: String): String
//}
//
//fun testvvvvvvvv(action: Action, bb: String): String {
//    return action.act(bb)
//}
//
//fun main() {
//    val testvvvvvvvv = testvvvvvvvv({ "aa" }, "test")
//    println(testvvvvvvvv)
//}

//class Testddd : Action {
//    override fun act(test: String): String {
//        return test + "ddd"
//    }
//}

//fun main() {
//
//    val action = Action { a -> a + "test" }
//    val act = action.act("ddddd")
//    println(act)
//
//}


fun interface Action {
    fun act(a: Int, b: Int): Int
}

fun delayActionz(a: Int, b: Int, action: Action): Int {
    return action.act(a, b)
}

fun main() {
    val action = Action { a, b -> a + b }
    val test = Action { a, b -> a % b }

}
