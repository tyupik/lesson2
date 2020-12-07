import kotlin.math.ceil

fun main() {
    val comissionPercent = 0.0075
    val comissionRubMin = 3500
    val amount = 153_00

    val comissionRub = amount * comissionPercent
    if (comissionRub < 3500.0) {
        println("Комиссия в копейках: $comissionRubMin")
    } else {
        val comissionRubInt = ceil(comissionRub).toInt()
        println("Комиссия в копейках: $comissionRubInt")
    }
}