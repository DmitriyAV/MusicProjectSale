fun main() {
    val recentlySpending = 1200_00
    val saleTilTwothousand = 100_00
    val presentSale = 5
    val price = 5000_00
    val result = if (recentlySpending in 1001_00..10000_00) (price - saleTilTwothousand) / 100 else if (recentlySpending > 10001_00)
            (price - ((price / 100) * presentSale )) / 100 else price / 100

    println("$result рублей.")
}