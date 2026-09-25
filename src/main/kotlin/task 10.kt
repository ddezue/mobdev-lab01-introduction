open class Vehicle {
    open val name: String = "Vehicle"
    open val speed: Int = 0

    open fun start() {
        println("$name started moving at $speed km/h")
    }

    open fun stop() {
        println("$name stopped")
    }
}

class Boat : Vehicle() {
    override val name = "Boat"
    override val speed = 30

    override fun start() = println("$name started moving at $speed km/h")
    override fun stop() = println("$name stopped")
}

class Airplane : Vehicle() {
    override val name = "Airplane"
    override val speed = 900

    override fun start() = println("$name started moving at $speed km/h")
    override fun stop() = println("$name stopped")
}

class Tank : Vehicle() {
    override val name = "Tank"
    override val speed = 50

    override fun start() = println("$name started moving at $speed km/h")
    override fun stop() = println("$name stopped")
}

fun task10() {
    val vehicles: List<Vehicle> = listOf(Boat(), Airplane(), Tank())
    for (vehicle in vehicles) {
        vehicle.start()
        vehicle.stop()
        println()
    }
}