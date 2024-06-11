package challenges.oneweekpreparation

import data.DataReader
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Day3Test {

    private val testData = mutableListOf<Triple<String, String, String>>()

    @Test
    fun testMethod() {
        readData()
        testData.forEachIndexed { index, it ->
            println(it)
            val values = it.first.trim().split(" ").map { it.trim().toInt() }

            val res = Day3.findZigZagSequence(values)

            assertEquals(it.third, res, "Failed test case #${index + 1}")
        }
    }

    private fun readData() {
        val input = DataReader.readResourceFile("template-input")
        val output = DataReader.readResourceFile("template-output")

        input.forEachIndexed { index, it ->
            testData.add(Triple(it, "", output[index]))
        }
    }

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
