package challenges.oneweekpreparation

object TradingProfit {
    fun tradingProfit(events: Array<String>): Array<Long> {
        val stocks = mutableMapOf<String, Int>()
        var currentProfit = 0L
        val profits = mutableListOf<Long>()
        events.forEach {
            val parts = it.trim().split(" ")
            val type = parts[0]
            when (type.lowercase()) {
                "buy" -> {
                    val stock = parts[1]
                    val quantity = parts[2].toInt()
                    stocks[stock] = stocks.getOrDefault(stock, 0) + quantity
                }
                "sell" -> {
                    val stock = parts[1]
                    val quantity = parts[2].toInt()
                    stocks[stock] = stocks.getOrDefault(stock, 0) - quantity
                }
                "change" -> {
                    val stock = parts[1]
                    val value = parts[2].toInt()
                    currentProfit += stocks.getOrDefault(stock, 0) * value
                }
                "query" -> {
                    profits.add(currentProfit)
                }
            }
        }

        return profits.toTypedArray()
    }
}
