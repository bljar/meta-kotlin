data class OrderItem(
    val name: String,
    val price: Double
)
class TaxCalculator {
    companion object {
        val salesTaxPercentage = 15.0

        fun getTaxAmountForOrderItems(orderItemList: List<OrderItem>): Double {

        }

    }
}