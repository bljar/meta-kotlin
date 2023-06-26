data class OrderItem(
    val name: String,
    val price: Double
)
class TaxCalculator {
    companion object {
        val salesTaxPercentage = 15.0

        fun getTaxAmountForOrderItems(orderItemList: List<OrderItem>): Double {
            var orderAmount = 0.00
            orderItemList.forEach { orderAmount += it.price }
            return orderAmount * salesTaxPercentage / 100.00
        }

    }
}

fun main() {
    val orderItem = listOf(
        OrderItem("Burger", 8.00),
        OrderItem("Fries", 4.00),
        OrderItem("Soda", 2.00),
        OrderItem("Ice Cream", 4.00)
    )
    println(TaxCalculator.getTaxAmountForOrderItems(orderItem))
}