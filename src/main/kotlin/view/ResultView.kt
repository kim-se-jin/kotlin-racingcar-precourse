package racingcar.model.view
import racingcar.model.Car

class ResultView {
    // 경주 결과 출력
    fun printResult(cars: List<Car>) {
        val maxDistance = cars.maxOf { it.getPosition() }
        val winners = cars.filter { it.getPosition() == maxDistance }

        // 자동차별 경주 진행 상황 출력
        cars.forEach { car ->
            println("${car.name} : ${"-".repeat(car.getPosition())}")
        }
    }

    fun printWinners(cars: List<Car>) {
        val maxPosition = cars.maxOf { it.getPosition() }
        val winners = cars.filter { it.getPosition() == maxPosition }
        println("최종 우승자 : ${winners.joinToString(", ") { it.name }}")
    }

}