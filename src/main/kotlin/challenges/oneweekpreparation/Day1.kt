package challenges.oneweekpreparation

import java.lang.StringBuilder

class Day1 {

    companion object {
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
            return String.format("%.6f", (value.toFloat() / count))
        }
    }

}