package challenges.oneweekpreparation

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day1Test {

    @Test
    fun `calculateRatios with 1,1,0,-1,-1 expects 0,400000, 0,400000, 0,200000`() {
        val values = listOf(1, 1, 0, -1, -1)

        val ratios = Day1.calculateRatios(values)

        assertEquals(listOf("0.400000", "0.400000", "0.200000"), ratios)
    }

    @Test
    fun `calculateRatios with -4 3 -9 0 4 1 expects 0,500000, 0,333333, 0,166667`() {
        val values = listOf(-4, 3, -9, 0, 4, 1)

        val ratios = Day1.calculateRatios(values)

        assertEquals(listOf("0.500000", "0.333333", "0.166667"), ratios)
    }
}