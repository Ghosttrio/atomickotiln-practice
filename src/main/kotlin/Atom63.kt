interface Building
interface Kitchen

interface House: Building {
    val kitchen: Kitchen
}


class Features {
    fun f1() = "f1"
    fun f2() = "f2"
}

class Form {
    private val features = Features()

    fun operation1() = features.f1()
}


