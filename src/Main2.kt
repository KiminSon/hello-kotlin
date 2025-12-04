//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val priceA = 100
    val priceB = 200
    if (priceA > priceB) {
        println("priceA = $priceA")
    } else {
        println("priceB = $priceB")
    }


    val price: Int? = null
    if (price == null) {
        println("null check true")
    } else {
        println("price = $price")
    }


    val priceC: Int = 100
    if (priceC in arrayOf(100, 200, 300)) {
        println("contain")
    } else {
        println("not contained")
    }


    val priceD: Int = 400
    when (priceD) {
        100 -> println("1. priceD = $priceD")
        200 -> println("2. priceD = $priceD")
        300 -> println("3. priceD = $priceD")
        else -> println("4. Not")
    }


    val priceE: Int = 310
    when (priceE) {
        in 100..199 -> println("1. priceE = $priceE")
        in 200..299 -> println("2. priceE = $priceE")
        in 300..399 -> println("3. priceE = $priceE")
        else -> println("4. Not")
    }

    when {
        priceE in 100..199 -> println("1. priceE = $priceE")
        priceE in 200..299 -> println("2. priceE = $priceE")
        priceE in 300..399 -> println("3. priceE = $priceE")
        else -> println("4. Not")
    }
}