interface Controls {
    fun up(velocity: Int): String
    fun down(velocity: Int): String
}

class SpaceShipControls : Controls {
    override fun up(velocity: Int): String {
        return "up $velocity"
    }

    override fun down(velocity: Int): String {
        return "down $velocity"
    }
}

class ExplicitControls : Controls {

    private val controls = SpaceShipControls()

    // 수동으로 위임 구현
    override fun up(velocity: Int): String {
        return controls.up(velocity)
    }

    // 변형한 구현
    override fun down(velocity: Int): String {
        return controls.down(velocity) + "test"
    }

}

class DelegatedControls(
    private val controls: SpaceShipControls = SpaceShipControls()
) : Controls by controls {
    override fun down(velocity: Int): String {
        return controls.down(velocity) + "test"
    }
}


interface AI
class A : AI

class B(val a: A) : AI by a
