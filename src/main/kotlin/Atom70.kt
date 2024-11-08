object JustOne {
    val n = 2
    fun f() = n * 10
    fun g() = this.n * 20
}

fun main() {
//    JustOne() // 오류
    JustOne.n
    JustOne.f()
    JustOne.g()
}
