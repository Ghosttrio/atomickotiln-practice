fun main() {
    // 람다는 인자로 추가할 원소의 인덱스를 받는다.
    val list1 = List(10) { it }

    // 한 값으로만 이뤄진 리스트
    val list2 = List(10) { 0 }

    // 글자로 이뤄진 리스트
    val list3 = List(10) { 'a' + it }

    //  정해진 순서를 반복
    val list4 = List(10) { list3[it % 3] }

    val mutableList1 = MutableList(5) { 10 * (it + 1) }
    val mutableList2 = MutableList(5, { 10 * (it + 1) })


    val list5 = listOf(-3, -1, 5, 7, 10)

    list5.filter { it > 0 } // listOf(5, 7, 10)
    list5.count { it > 0 } // 3

    list5.find { it > 0 } // 5
    list5.firstOrNull { it > 0 } // 5
    list5.lastOrNull { it < 0 } // -1

    list5.any { it > 0 } // true
    list5.any { it != 0 }

    list5.partition { it > 0 }
    test222()
}

fun createPair() = Pair(1, "one")

fun test111() {
    val (i, s) = createPair()
}

data class Product(
    val description: String,
    val price: Double
)

fun test222() {
    val products = listOf(Product("a", 1.0), Product("b", 2.0))
    val sumOf = products.sumOf { it.price }

    val sortedByDescending = products.sortedByDescending { it.price }

    products.minByOrNull { it.price }
}
