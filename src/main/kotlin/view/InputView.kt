package racingcar.view
import java.util.Scanner

class InputView {
    private val scanner = Scanner(System.`in`)

    fun getCarNames(): String {
        while (true) {
            try {
                println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
                val input = scanner.nextLine()
                validateCarNames(input)
                return input
            } catch (e: IllegalArgumentException) {
                println("[ERROR] 자동차 이름은 5자 이하만 가능합니다. 다시 입력해주세요.")
            }
        }
    }

    fun getRoundCount(): Int {
        while (true) {
            try {
                println("시도할 회수는 몇회인가요?")
                val input = scanner.nextLine()
                val roundCount = input.toInt()
                validateRoundCount(roundCount)
                return roundCount
            } catch (e: IllegalArgumentException) {
                println("[ERROR] 시도할 횟수는 양의 정수만 가능합니다. 다시 입력해주세요.")
            }
        }
    }

    private fun validateCarNames(names: String) {
        val nameList = names.split(",")
        if (nameList.any { it.length > 5 }) {
            throw IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.")
        }
    }

    private fun validateRoundCount(roundCount: Int) {
        if (roundCount <= 0) {
            throw IllegalArgumentException("시도할 횟수는 1 이상의 정수여야 합니다.")
        }
    }
}
