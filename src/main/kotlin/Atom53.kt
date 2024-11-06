//fun main() {
//    val list = listOf(1, 10, 100, 1000)
//    val result = list.fold(0) { sum, n -> sum + n }
//    println(result)
//}

fun main() {
    val list = listOf(1, 10, 100, 1000)
    val result = list.reduce { a, b -> a + b }
    println(result)

    val a = list.runningFold(7) { sum, n -> sum + n }
    println(a)
}
