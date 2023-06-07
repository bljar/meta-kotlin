fun task1() {
    for (i in 1..5) {
        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = 6 - i
        for (j in 1.. numberOfStars) {
            print("*")
        }
        println()
    }
}
fun task2() {
    for (i in 1..5) {
        val numberOfSpaces = i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = 11 - (i * 2)
        for (j in 1.. numberOfStars) {
            print("*")
        }
        println()
    }
}
fun main() {
    for (i in 1..5) {
        val numberOfSpaces = 6-i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = i-1
        for (j in 1.. numberOfStars) {
            print("*")
        }
        println()
    }
    for (i in 1..5) {
        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = 6 - i
        for (j in 1.. numberOfStars) {
            print("*")
        }
        println()
    }
}