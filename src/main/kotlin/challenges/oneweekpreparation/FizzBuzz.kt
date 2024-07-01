package challenges.oneweekpreparation

object FizzBuzz {
    fun fizzbuzz(value: Int) {
        for (index in 1..value) {
            when {
                index % 3 == 0 && index % 5 == 0 -> println("FizzBuzz")
                index % 3 == 0 -> println("Fizz")
                index % 5 == 0 -> println("Buzz")
                else -> println(index)
            }
        }
    }
}
