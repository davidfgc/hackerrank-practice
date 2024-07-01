package challenges.oneweekpreparation

import data.DataReader
import org.junit.jupiter.api.Test

class TradingProfitTest {

    private val testData = mutableListOf<Triple<String, String, String>>()

    @Test
    fun tradingProfit() {
        readData()
        val lines: Array<String> = testData.map { it.first }.toTypedArray()

        val output = TradingProfit.tradingProfit(lines)

        kotlin.test.assertEquals(listOf(-16L), output.toList())
    }

    private fun readData(filePrefix: String = "trading-profit") {
        val input = DataReader.readResourceFile("$filePrefix-input")
        val output = DataReader.readResourceFile("$filePrefix-output")

        input.forEachIndexed { index, it ->
            testData.add(Triple(it, "", output[index]))
        }
    }
}