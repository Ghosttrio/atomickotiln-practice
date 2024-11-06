//fun main() {
//    val list = listOf(1, 2, 3, 4)
//
//    list.filter { it % 2 == 0 }
//        .map { it * it }
//        .any { it < 10 }
//}

fun Int.isEven(): Boolean {
    return this % 2 == 0
}

fun Int.square(): Int {
    return this * this
}

fun Int.lessThanTen(): Boolean {
    return this < 0
}

fun main() {
    val list = listOf(1, 2, 3, 4, 5)

    list.filter(Int::isEven)
        .map(Int::square)
        .any(Int::lessThanTen)

    list.asSequence()
        .filter(Int::isEven)
        .map(Int::square)
        .any(Int::lessThanTen)
}
