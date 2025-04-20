package utils

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.RepeatedTest
import racingcar.utils.RandomNumberGenerator

class RandomNumberGeneratorTest {
    @RepeatedTest(100)
    fun `0 이상 9 이하의 숫자를 반환한다`() {
        var randomNumberGenerator = RandomNumberGenerator()
        val number = randomNumberGenerator.generate()
        assertThat(number).isBetween(0, 9)
    }
}