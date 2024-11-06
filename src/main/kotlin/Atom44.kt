fun main() {
    val list = listOf(1, 2, 3, 4)
    val result = list.map { n: Int -> "[$n]" }
}

fun test() {
    val list = listOf(1, 2, 3, 4)
    val result = list.map { "[$it]" }
}

fun test2() {
    val list = listOf(1, 2, 3, 4)
    val joinToString = list.joinToString(" "){"[$it]"}
    println(joinToString)
}

fun test3() {
    val list = listOf(1, 2, 3, 4)
    val joinToString = list.joinToString(separator = " ", transform = {"[$it]"})
    println(joinToString)
}

fun test4() {
    val list = listOf(1, 2, 3, 4)
    val mapIndexed = list.mapIndexed { index, element -> "[$index: $element]" }
}

fun test5() {
    val list = listOf(1, 2, 3, 4)
    val mapIndexed = list.mapIndexed { index, _ -> "[$index]" }
}
