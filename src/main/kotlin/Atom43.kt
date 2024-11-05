fun main() {
    val strings = mutableListOf<String>()

    outer@ for (c in 'a'.. 'e') {
        for (i in 1..9) {
            if (i == 5) continue@outer
            if ("$c$i" == "c3") break@outer
            strings.add("$c$i")
        }
    }

    println(strings)
}
