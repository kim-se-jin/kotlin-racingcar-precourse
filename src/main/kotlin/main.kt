package racingcar.model
fun main() {
    val cars = Cars("pobi,woni,jun")

    // 경주 5번 진행
    repeat(5) {
        cars.move()
        println(cars.getResults())
    }

    // 우승자 출력
    val winners = cars.getWinners()
    println("최종 우승자: ${winners.joinToString(", ")}")
}
