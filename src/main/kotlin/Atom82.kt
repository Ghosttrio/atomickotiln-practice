import kotlin.math.E

//data class Num(val n: Int)
//
//operator fun Num.plus(rval: Num) = Num(n + rval.n)
//
//fun main() {
//    Num(4) + Num(5)
//}
//
class E(var v: Int) {
    override fun hashCode(): Int {
        return v
    }

    override fun equals(other: Any?) = when {
        this === other -> true
        other!is E -> false
        else -> v ==other.v
    }
}

operator fun E.compareTo(e: E): Int {
    return v.compareTo(e.v)
}
