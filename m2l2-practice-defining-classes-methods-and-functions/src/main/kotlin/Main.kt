class Player(val name: String, val surName: String) {
    var totalScore = 0
    var personalBestScore = 0
    fun fullName(): String {
        return "$name $surName"
    }
}

fun main() {
    val P1 = Player("Nicola", "Tesla")
    val P2 = Player("Thomas", "Edison")

    println(P1.fullName())
}