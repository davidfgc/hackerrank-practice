package challenges.oneweekpreparation

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Day3Test {

    private val testData = listOf(
        Triple("2 3 5 1 4",  "", "1 2 5 4 3"),
        Triple("1 2 3 4 5 6 7", "", "1 2 3 7 6 5 4")
    )

    @Test
    fun testMethod() {
        testData.forEachIndexed { index, it ->
            val values = it.first.trim().split(" ").map { it.trim().toInt() }

            val res = Day3.findZigZagSequence(values)

            assertEquals(it.third, res, "Failed test case #${index + 1}")
        }
    }

    private fun linesToMatrix(lines: List<String>) =
        lines.map {
            it.split(" ").map { value -> value.toInt() }.toTypedArray()
        }.toTypedArray()

}

//fun towerBreakers(n: Int, m: Int): Int {
//    var player = 1
//    var move: Boolean
//    var towers = Array(n) { m }
//
//    loopGame@ while (towers.any { it > 1 }) {
//        move = false
//        towers.forEachIndexed { towerIndex, it ->
//            if (it == 1) continue@loopGame
//            loopTowers@ for (index in it - 1 downTo 1) {
//                println("for: $index")
//                if (it % index == 0) {
//                    towers[towerIndex] = it
//                    player = changePlayer(player)
//                    move = true
//                    break@loopTowers
//                }
//            }
//            val s = ""
//            if (!move) break
//        }
//    }
//
//    return changePlayer(player)
//}
