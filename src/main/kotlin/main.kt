import kotlin.random.Random

fun main() {
    val amount:Int = Random.nextInt(1, 13_000_00) // до 13 тыс.руб. в копейках
    val vip:Boolean = true

    val priceWithDiscount:Int = when(amount) {
                                in 0..1000_00 -> amount
                                in 1000_01..10_000_00 -> (amount - 100_00)
                                else -> (amount * 95 / 100)
                            }

    val finalPrice:Int = if (!vip) {priceWithDiscount} else {priceWithDiscount * 99 / 100}

    println("Начальная цена ${amount/100.0} руб., со всеми скидками: ${finalPrice/100.0} руб.")

}