package racingcar.model.controller

import racingcar.model.Car
import racingcar.model.Cars
import racingcar.model.Race
import racingcar.model.view.ResultView
import racingcar.view.InputView

class GameController {
    private val inputView = InputView()
    private val resultView = ResultView()

    fun run() {
        val carNamesInput = inputView.getCarNames()
        val carNames = carNamesInput.split(",").map { it.trim() }
        val roundCount = inputView.getRoundCount()

        val cars = Cars(carNames.map { Car(it) })
        val race = Race(cars, roundCount)

        println("\n실행 결과")
        repeat(roundCount) {
            race.startRace()
        }
    }
}