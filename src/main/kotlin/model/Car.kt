package racingcar.model

import racingcar.utils.RandomNumberGenerator

class Car(val name: String) {
   init {
        require(isValidName(name)) {
            "[ERROR] 자동차 이름은 1자 이상 5자 이하이며, 공백이나 특수문자가 포함될 수 없습니다: $name"
        }
    }
    private var position: Int = 0
    private val randomNumberGenerator = RandomNumberGenerator()  // 랜덤 숫자 생성기


    private fun isValidName(name: String): Boolean {
        // 이름 길이 검증
        if (name.length < 1 || name.length > 5) return false

        // 공백이나 특수문자 검증
        if (name.any { !it.isLetterOrDigit() }) return false

        return true
    }

    fun move() {
        val randomNumber = randomNumberGenerator.generate()  // 0~9 사이의 랜덤 숫자 생성
        if (randomNumber >= 4) {
            position++  // 랜덤 숫자가 4 이상일 경우 전진
        }
    }

    fun getPosition(): Int = position

    override fun toString(): String {
        return "$name : ${"-".repeat(position)}"
    }
}