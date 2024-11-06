data class Person(
    val name: String,
    val age: Int
)
val names = listOf("a", "b", "c", "d", "e", "f")
val ages = listOf(1, 2, 3, 4, 5, 5)

fun people(): List<Person> =
    names.zip(ages) {
        name, age -> Person(name, age)
    }
//fun main() {
//    val map: Map<Int, List<Person>> = people().groupBy (Person::age)
//    println(map)
//}


//fun main() {
//    val map: Map<String, Person> = people().associateBy { it.name }
//    println(map)
//}

//fun main() {
//    val map = mapOf(1 to "one", 2 to "two")
//    val orElse = map.getOrElse(0) { "zero" }
//
//    val mutableMap = map.toMutableMap()
//    mutableMap.getOrPut(0) {"zero"}
//}

fun main() {
    val even = mapOf(2 to "two", 4 to "four")
    even.map { "${it.key}=${it.value}" }

    even.map { (key, value) -> "$key=$value" }

    even.mapKeys { (num, _) -> -num }
        .mapValues { (_, str) -> "minus $str" }

    even.map { (key, value) ->
        -key to "minus $value"
    }
}
