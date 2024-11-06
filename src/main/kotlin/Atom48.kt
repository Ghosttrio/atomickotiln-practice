import java.util.function.BiPredicate

val isPlus: (Int) -> Boolean = { it > 0 }

val helloWorld: () -> String = {"HELLO WORLD!"}

val sum: (Int, Int) -> Int = { x, y -> x + y }

//fun <T> List<T>.any(
//    predicate: (T) -> Boolean
//): Boolean {
//    for (element in this) {
//        if (predicate(element)) {
//            return true
//        }
//    }
//    return false
//}

fun repeat(times: Int, action: (Int) -> Unit) {
    for (index in 0 until times) {
        action(index)
    }
}

fun main() {

    repeat(3) { println("[$it]") }
//    val ints = listOf(1, 2, -3)
//    ints.any { it > 0} // true
//    val strings = listOf("abc", " ")
//    strings.any { it.isBlank() } // true
//    strings.any(String::isBlank) // true


//    val any = listOf(1, -1, 3).any(isPlus)
//    println(any)
}
