package racingcar.model

class Car(
    val name: String,
    private var position: Int = 0
) {
    init {
        require(isValidName(name)) {
            "[ERROR] 자동차 이름은 1자 이상 5자 이하이며, 공백이나 특수문자가 포함될 수 없습니다: $name"
        }
    }

    private fun isValidName(name: String): Boolean {
        // 이름 길이 검증
        if (name.length < 1 || name.length > 5) return false

        // 공백이나 특수문자 검증
        if (name.any { !it.isLetterOrDigit() }) return false

        return true
    }

    fun move(canMove: Boolean) {
        if (canMove) {
            position += 1
        }
    }

    fun getPosition(): Int = position

    override fun toString(): String {
        return "$name : ${"-".repeat(position)}"
    }
}