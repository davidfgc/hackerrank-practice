package challenges.oneweekpreparation

import data.DataReader
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Day3Test {

    private val testData = mutableListOf<Triple<String, String, String>>()

    @Test
    fun testMethod() {
        readData("day3-zigzag")
        testData.forEachIndexed { index, it ->
            println(it)
            val values = it.first.trim().split(" ").map { it.trim().toInt() }

            val res = Day3.findZigZagSequence(values)

            assertEquals(it.third, res, "Failed test case #${index + 1}")
        }
    }

    private fun readData(filePrefix: String = "day3") {
        val input = DataReader.readResourceFile("$filePrefix-input")
        val output = DataReader.readResourceFile("$filePrefix-output")

        input.forEachIndexed { index, it ->
            testData.add(Triple(it, "", output[index]))
        }
    }

    @Test
    fun palindromeIndex() {
        readData("day3-palindrome")

        testData.forEach {
            val index = Day3.palindromeIndex(it.first)

            assertEquals(it.third.toInt(), index)
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
