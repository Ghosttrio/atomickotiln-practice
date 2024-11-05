fun main() {
    val s: String? = null
    println(s?.length)
    val s2: String? = "test"
    println(s2?.length)

    if (s != null) s.length else null
    val length2 = s?.length


    val test: String? = "abc"
    val s1 = test ?: "aaaa"
    println(s1)

    val test2: String? = null
    val s3 = test2 ?: "zzz"
    println(s3)
}
