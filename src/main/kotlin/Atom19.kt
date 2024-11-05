class Wombat

class Alien(name: String) {
    val greeting = "Poor $name!"
}

fun main() {
    val wombat = Wombat()

    val alien = Alien("test")
    println(alien.greeting)
}

class Scientist(val name: String) {
    override fun toString(): String {
        return "Scientist('$name')"
    }
}


