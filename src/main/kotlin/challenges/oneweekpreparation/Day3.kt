package challenges.oneweekpreparation

object Day3 {

    fun findZigZagSequence(values: List<Int>): String {
        val sorted = values.sorted().toMutableList()
        var leftIndex = (values.count() / 2.0).toInt()
        var rightIndex = values.count() - 1

        while (leftIndex < rightIndex) {
            val temp = sorted[rightIndex]
            sorted[rightIndex] = sorted[leftIndex]
            sorted[leftIndex] = temp
            leftIndex++
            rightIndex--
        }

        return sorted.joinToString(" ")
    }

    fun palindromeIndex(s: String): Int {
        var leftIndex = 0
        var rightIndex = s.length - 1

        while (leftIndex < rightIndex) {
            if (s[leftIndex] == s[rightIndex]) {
                leftIndex++
                rightIndex--
                continue
            } else {
                val palindrome = s.substring(0, leftIndex).plus(s.substring(leftIndex + 1))
                if (palindrome == palindrome.reversed()) return leftIndex
                else {
                    val palindrome2 =  s.substring(0, rightIndex).plus(s.substring(rightIndex + 1))
                    return if (palindrome2 == palindrome2.reversed()) rightIndex
                    else -1
                }
            }
        }

        return -1
    }
}
