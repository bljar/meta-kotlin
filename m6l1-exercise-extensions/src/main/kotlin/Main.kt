class Dish(
    val dishName: String,
    val ingredients: MutableList<String>
)

fun Dish.printIngredients() {
    println(this.ingredients)
}

fun main() {
    val onionSoup = Dish("Onion Soup", mutableListOf("Onion", "Cheese", "Water", "Salt"))
    onionSoup.printIngredients()
}