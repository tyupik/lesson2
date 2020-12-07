import kotlin.math.ceil

fun main() {
    val standardDiscount = 100
    val increasedDiscount = 0.95
    val discountForRegularCustomer = 0.99
    val isRegularCustomer = true
    val previousPurchase = 10001
    val amountOfPurchases = 1000
    var totalPrice = 0.0
    println("Покупка - $amountOfPurchases руб.")
    if (previousPurchase in 1001..10000) {
        totalPrice = (amountOfPurchases - standardDiscount).toDouble()
        println("после применения скидки в 100 руб - ${totalPrice.toInt()} руб.")
    } else if (previousPurchase > 10000) {
        totalPrice = amountOfPurchases * increasedDiscount
        if (totalPrice % 1 == 0.0) {
            println("после применения 5% скидки - ${totalPrice.toInt()} руб.")
        } else {
            println("после применения 5% скидки - ${totalPrice.toInt()} руб. ${ceil(totalPrice % 1.0 * 100).toInt()} коп.")
        }
    }
    if (isRegularCustomer) {
        totalPrice *= discountForRegularCustomer
        if (totalPrice % 1 == 0.0) {
            println("после применения 1% скидки - ${totalPrice.toInt()} руб.")
        } else {
            println("после применения 1% скидки - ${totalPrice.toInt()} руб. ${ceil(totalPrice % 1.0 * 100).toInt()} коп.")
        }
    }
}