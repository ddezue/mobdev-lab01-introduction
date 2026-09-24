open class Vehicle(
    open val name: String = "Транспортное средство",
    open val speed: Int = 0
) {
    open fun start() {
        println("$name начал движение со скоростью $speed км/ч")
    }

    open fun stop() {
        println("$name остановился")
    }
}

class Boat(
    override val name: String = "Лодка",
    override val speed: Int = 30
) : Vehicle(name, speed) {
    override fun start() {
        println("$name начала движение со скоростью $speed км/ч")
    }

    override fun stop() {
        println("$name остановилась")
    }
}

class Airplane(
    override val name: String = "Самолет",
    override val speed: Int = 900
) : Vehicle(name, speed) {
    override fun start() {
        println("$name начал движение со скоростью $speed км/ч")
    }

    override fun stop() {
        println("$name остановился")
    }
}

class Tank(
    override val name: String = "Танк",
    override val speed: Int = 50
) : Vehicle(name, speed) {
    override fun start() {
        println("$name начал движение со скоростью $speed км/ч")
    }

    override fun stop() {
        println("$name остановился")
    }
}

fun task10() {
    val vehicles: List<Vehicle> = listOf(Boat(), Airplane(), Tank())
    for (vehicle in vehicles) {
        vehicle.start()
        vehicle.stop()
        println("---")
    }
}