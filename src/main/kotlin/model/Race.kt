package racingcar.model

class Race(private val cars: Cars, private val rounds: Int) {
    fun startRace() {
        repeat(rounds) { round ->
            println("Round ${round + 1}")
            cars.move()
            println(cars.getResults())
        }
    }

    fun announceWinner(): String {
        val winners = cars.getWinners()
        return "최종 우승자: ${winners.joinToString(", ")}"
    }
}