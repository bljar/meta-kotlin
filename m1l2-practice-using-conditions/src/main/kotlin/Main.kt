fun Task1() {
    // 1.
    val weekday = "Friday"
    // 2.
    println("On $weekday, the opening hours are:")
    // 3.
    if (weekday == "Monday") {
        println("8 AM to 12 PM")
    } else if (weekday == "Tuesday") {
        println("8 AM to 6 PM")
    } else if (weekday == "Wednesday") {
        println("8 AM to 6 PM")
    } else if (weekday == "Thursday") {
        println("8 AM to 6 PM")
    } else if (weekday == "Friday") {
        println("8 AM to 9 PM")
    } else if (weekday == "Saturday") {
        println("9 AM to 4 PM")
    } else if (weekday == "Sunday") {
        println("8 AM to 4 PM")
    }
}
fun main() {
    val weekday = "Friday"
    val hour = 20
    val isOpen = when (weekday) {
        "Monday" -> hour in 8..12
        "Tuesday", "Wednesday", "Thursday" -> hour in 8..18
        "Friday" -> hour in 8..21
        "Saturday" -> hour in 9..16
        "Sunday" -> hour in 8..16
        else -> false
    }
    if (isOpen) {
        println("Little Lemon is open now")
    } else {
        println("Little Lemon is closed now")
    }
}