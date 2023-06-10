fun main() {
    println("Welcome to your banking system.\n" +
            "What type of account would you like to create?\n" +
            "1. Debit account\n" +
            "2. Credit account\n" +
            "3. Checking account")
    var accountType = ""
    while (accountType == "") {
        println("Choose an option (1, 2 or 3)")
        val userChoice = (1..5).random()
        println("The selected option is $userChoice")
        accountType = when (userChoice) {
            1 -> "debit"
            2 -> "credit"
            3 -> "checking"
            else -> continue
        }
    }
    println("You have created a $accountType account.")
}