class Player(val name: String, val surName: String) {
    fun fullName(): String {
        return "$name $surName"
    }
}

fun main() {
    val P1 = Player("Nicola", "Tesla")
    val P2 = Player("Thomas", "Edison")
}