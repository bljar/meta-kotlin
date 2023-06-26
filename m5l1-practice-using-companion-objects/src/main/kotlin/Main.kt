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