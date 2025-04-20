package racingcar.model

class Cars(names: String) {
    private val cars: List<Car> = names.split(",")
        .map { name -> Car(name) }

    fun move() {
        cars.forEach { car ->
            val canMove = (0..9).random() >= 4
            car.move(canMove)
        }
    }

    fun getResults(): String {
        return cars.joinToString(", ") { car -> car.toString() }
    }

    fun getWinners(): List<String> {
        val maxPosition = cars.maxOf { it.getPosition() }
        return cars.filter { it.getPosition() == maxPosition }
            .map { it.name }
    }
}
