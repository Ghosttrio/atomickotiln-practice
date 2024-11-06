fun main() {
    val list = listOf(1, 2, 3, 4)
    val even = list.filter { e -> e % 2 == 0 }
    val gt = list.filter { it > 2 }

    val isEven = {e: Int -> e % 2 == 0}
    list.filter(isEven)
}

fun test0() {
    val list = listOf(1, 2, 3, 4)
    val divider = 5
    list.filter { it % divider == 0 }
}
