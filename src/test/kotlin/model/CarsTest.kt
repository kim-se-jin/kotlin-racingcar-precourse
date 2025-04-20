package model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import racingcar.model.Car
import racingcar.model.Cars

class CarsTest {
    @Test
    fun `가장 멀리 간 자동차가 우승자다`() {
        val car1 = Car("a").apply { repeat(3) { move() } }
        val car2 = Car("b").apply { repeat(5) { move() } }
        val car3 = Car("c").apply { repeat(7) { move() } }

        val cars = Cars(listOf(car1, car2, car3))

        val winners = cars.getWinners()
        assertThat(winners.map { it }).containsExactlyInAnyOrder("c")
    }
}