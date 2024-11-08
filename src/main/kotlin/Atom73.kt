import kotlin.Exception
import kotlin.reflect.KClass

class Exception1(
    val value: Int
): Exception("wrong value: $value")

open class Exception2(
    description: String
): Exception(description)

class Exception3(
    description: String
): Exception2(description)

fun main() {
    try {
        throw Exception1(13)
    } catch (e: Exception) {
        println(e.message)
    }
}

