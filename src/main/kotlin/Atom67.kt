//sealed class Transport
//
//data class Train(
//    val line: String
//): Transport()
//
//data class Bus(
//    val number: String,
//    val capacity: Int
//): Transport()
//
//fun travel(transport: Transport) =
//    when (transport) {
//        is Train -> "Train ${transport.line}"
//        is Bus -> "Bus ${transport.number} : size ${transport.capacity}"
////        else -> "$transport is in limbo!"
//    }
//
//fun main() {
//    val map = listOf(Train("S1"), Bus("11", 90))
//        .map(::travel)
//    println(map)
//}


sealed class Top
class Middle1: Top()
class Middle2: Top()

open class Middle3: Top()
class Bottom3: Middle3()

fun main() {
    Top::class.sealedSubclasses
        .map { it.simpleName }
}
