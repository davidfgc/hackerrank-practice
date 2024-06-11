package challenges.oneweekpreparation

import data.DataReader
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Day2Test {

    private val testData = listOf(
        Triple(DataReader.readResourceFile("day2-matrix1"), "", 414),
        Triple(DataReader.readResourceFile("day2-matrix2"), "", 488)
    )

    @Test
    fun testMethod() {
        testData.forEachIndexed { index, it ->
            val matrix = linesToMatrix(it.first)

            val maxSum = Day2.flippingMatrix(matrix)

            assertEquals(it.third, maxSum, "Failed test case #${index + 1}")
        }
    }

    private fun linesToMatrix(lines: List<String>) =
        lines.map {
            it.split(" ").map { value -> value.toInt() }.toTypedArray()
        }.toTypedArray()

}