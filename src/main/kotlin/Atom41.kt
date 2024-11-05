import java.util.NoSuchElementException

//class GenericHolder<T>(private val value: T) {
//    fun getValue(): T = value
//}
//
//class AnyHolder (private val value: Any) {
//    fun getValue(): Any = value
//}
//
//fun main() {
//    val genericHolder = GenericHolder(Dog())
//    val bark = genericHolder.getValue().bark()
//    println(bark)
//
//    val anyHolder = AnyHolder(Dog())
////    val bark2 = anyHolder.getValue().bark()
////    println(bark2)
//}
//
//class Dog {
//    fun bark() = "bark!!!!"
//}



fun <T> identity(arg: T): T = arg

fun main() {
    identity("test")
    identity(1)
}

fun <T> List<T>.first(): T {
    if (isEmpty()) {
        throw NoSuchElementException("Empty LIST")
    }
    return this[0]
}

fun <T> List<T>.firstOrNull(): T? = if (isEmpty()) null else this[0]
