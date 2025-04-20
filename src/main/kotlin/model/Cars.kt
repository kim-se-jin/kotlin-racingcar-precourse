package racingcar.model

class Cars(cars: List<Car>) {
    private val cars: List<Car> = cars

    fun move() {
        cars.forEach { car ->
            car.move()  // 각 자동차가 전진 여부를 결정
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
