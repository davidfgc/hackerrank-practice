package challenges.oneweekpreparation

import data.DataReader
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Day6Test {

    private val testData = mutableListOf<Triple<String, String, String>>()

    @Test
    fun testDataMethod() {
        readData()
        testData.forEachIndexed { index, it ->
            println(it)
            val sweetness = it.first.trim().toInt()
            val cookies = it.second.trim().split(" ").map { it.toInt() }.toIntArray()

            val res = Day6.cookies(sweetness, cookies)

            assertEquals(it.third.toInt(), res, "Failed test case #${index + 1}")
        }
    }

    private fun readData() {
        val input = DataReader.readResourceFile("day6-input")
        val input2 = DataReader.readResourceFile("day6-input2")
        val output = DataReader.readResourceFile("day6-output")

        input.forEachIndexed { index, it ->
            testData.add(Triple(it, input2[index], output[index]))
        }
    }
}