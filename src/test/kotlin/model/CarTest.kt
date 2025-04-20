package model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.model.Car

class CarTest {
    @Test
    fun `전진 조건이 true일 때 자동차는 전진한다`() {
        val car = Car("pobi")
        car.move()
        assertThat(car.getPosition()).isEqualTo(1)
    }

    @Test
    fun `전진 조건이 false일 때 자동차는 정지한다`() {
        val car = Car("pobi")
        assertThat(car.getPosition()).isEqualTo(0)
    }
}