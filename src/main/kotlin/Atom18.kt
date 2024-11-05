val constant = 42

class Test {
    val test = 0;
}

fun main() {
    val innerTest = 1;

    val test = Test().test
    println(test)
    println(innerTest)
}
