//fun main() {
//    val left = listOf("a", "b", "c", "d")
//    val right = listOf("a1", "b1", "c1", "d1")
//    val zip = left.zip(right)
//    println(zip)
//}

//data class Person(
//    val name: String,
//    val id: Int
//)
//
//fun main() {
//    val names = listOf("B", "J", "JIM")
//    val ids = listOf(123, 43, 6342)
//    names.zip(ids) {name, id -> Person(name, id)}
//}

//}


//fun main() {
//    val list = listOf('a', 'b', 'c', 'd')
//
////    [(a, b), (b, c), (c, d)]
//    val zipWithNext = list.zipWithNext()
//    val zipWithNext1 = list.zipWithNext { a, b -> "$a$b" }
//    println(zipWithNext1)
//fun main() {
//    val list = listOf(
//        listOf(1, 2),
//        listOf(3, 4),
//        listOf(5, 6)
//    )
//    val flatten = list.flatten()
//    println(flatten)
//}

//fun main() {
//    val intRange = 1..3
//
//    val map = intRange.map { a ->
//        intRange.map { b ->
//            a to b
//        }
//    }
//
//    val flatten = intRange.map { a ->
//        intRange.map { b -> a to b }
//    }.flatten()
//
//    val flatMap = intRange.flatMap { a ->
//        intRange.map { b -> a to b }
//    }
//}
//class Book1(
//    val title: String,
//    val authors: List<String>
//)
//
//fun main() {
//    val books = listOf(
//        Book1("1", listOf("aa")),
//        Book1("2", listOf("bb"))
//    )
//
//    books.map {it.authors}.flatten()
//    books.flatMap { it.authors }
//}

enum class Suit {
    A, B, C, D
}

enum class Rank(val value: Int) {
    AA(1), BB(2), CC(3)
}

class Card(val rank: Rank, val suit: Suit) {
    override fun toString(): String {
        return "$rank of ${suit}s"
    }
}

val deck: List<Card> =
    Suit.values().flatMap { suit ->
        Rank.values().map { rank ->
            Card(rank, suit)
        }
    }


fun main() {

}
