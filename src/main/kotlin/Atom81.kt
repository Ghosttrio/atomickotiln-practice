import kotlin.reflect.KClass

fun <T> gFunction(arg: T): T = arg

class GClass<T>(val x: T) {
    fun f(): T = x
}

class GMemberFunction {
    fun <T> f(arg: T): T = arg
}

interface GInterface<T> {
    val x: T
    fun f(): T
}

class GImplementation<T>(override val x: T) : GInterface<T> {
    override fun f(): T {
        return x
    }
}

class ConcreteImplementation : GInterface<String> {
    override val x: String
        get() = "x"
    override fun f(): String {
        return "x"
    }
}

fun <T: Any> a(kClass: KClass<T>) {

}


inline fun <reified T: Any> d() = a(T::class)
