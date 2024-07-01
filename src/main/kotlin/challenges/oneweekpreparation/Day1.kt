package challenges.oneweekpreparation

import java.text.DecimalFormat

object Day1 {
    fun calculateRatios(values: List<Int>): List<String> {
        val positive = values.count { it > 0 }
        val negative = values.count { it < 0 }
        val zero = values.count() - positive - negative

        return listOf(
            formatValue(positive, values.count()),
            formatValue(negative, values.count()),
            formatValue(zero, values.count())
        )
    }

    private fun formatValue(value: Int, count: Int): String {
        val formatter = DecimalFormat("0.000000")
        return formatter.format(value.toFloat() / count)
    }
}
