fun main() {

    val price1 = 100
    val price2 = 200

    val price3 = sumPrice(price1, price2)
    println("price3 = $price3")

    val price4 = sumPrice2(price1, price2)
    println("price4 = $price4")
}

fun sumPrice(price1: Int, price2: Int): Int {
    val price = price1 + price2
    return price
}

fun sumPrice2(price1: Int, price2: Int) = price1 + price2 + price1