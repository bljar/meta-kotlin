fun main() {
    // Task 1.1
    println("Welcome to your banking system.\n" +
            "What type of account would you like to create?\n" +
            "1. Debit account\n" +
            "2. Credit account\n" +
            "3. Checking account")

    // Task 1.2
    var accountType = ""
    var userChoice: Int

    // Task 1.3
    while (accountType == "") {
        println("Choose an option (1, 2 or 3)")
        userChoice = (1..5).random()
        println("The selected option is $userChoice")
        accountType = when (userChoice) {
            1 -> "debit"
            2 -> "credit"
            3 -> "checking"
            else -> continue
        }
    }

    // Task 1.4
    println("You have created a $accountType account.")

    // Task 2.1
    var accountBalance = (0..1000).random()
    println("The current balance is $accountBalance dollars.")
    val money = (0..1000).random()
    println("The amount you transferred is $money dollars.")

    // Task 2.2
    //var output: Int

    // Task 2.3
    fun withdraw(amount: Int): Int {
        accountBalance -= amount
        println("You successfully withdrew $amount dollars. The current balance is $accountBalance dollars.")
        return amount
    }

    // Task 2.4
    //output = withdraw(money)
    //println("The amount you withdrew is $output dollars.")

    // Step 2.5
    fun debitWithdraw(amount: Int): Int {
        return if (accountBalance == 0) {
            println("Can't withdraw, no money on this account!")
            accountBalance
        } else if (amount > accountBalance) {
            println("Not enough money on this account! The checking balance is $accountBalance dollars.")
            0
        } else {
            withdraw(amount)
        }

    }

    // Task 2.6
    //output = debitWithdraw(money)
    //println("The amount you withdrew is $output dollars.")

    // Task 2.7
    fun deposit(amount: Int): Int {
        accountBalance += amount
        println("You successfully deposited $amount dollars. The current balance is $accountBalance dollars.")
        return amount
    }

    // Task 2.8
    //output = deposit(money)
    //println("The amount you deposited is $output dollars.")

    // Task 2.9
    fun creditDeposit(amount: Int): Int {
        return if (accountBalance == 0) {
            println("This account is completely paid off! Do not deposit money!")
            0
        } else if (amount + accountBalance > 0) {
            println("Deposit failed, you tried to pay off an amount greater than the credit balance. The checking balance is $accountBalance dollars.")
            0
        } else if (amount == -accountBalance) {
            accountBalance = 0
            println("You have paid off this account!")
            amount
        } else {
            (deposit(amount))
        }
    }

    // Task 2.10
    //output = creditDeposit(money)
    //println("Credit deposit output: $output")

    // Task 3.2
    fun transfer(mode: String) {
        val transferAmount: Int
        when (mode) {
            "withdraw" -> {
                transferAmount = if (accountType == "debit") {
                    debitWithdraw(money)
                } else {
                    withdraw(money)
                }
                println("The amount you withdrew is $transferAmount dollars.")

            }
            "deposit" -> {
                transferAmount = if (accountType == "credit") {
                    creditDeposit(money)
                } else {
                    deposit(money)
                }
                println("The amount you deposited is $transferAmount dollars.")
            }
            else -> return
        }
    }

    // Task 3.3
    var isSystemOpen = true
    var option: Int

    // Task 3.4
    while (isSystemOpen) {
        println("What would you like to do?\n" +
                "1. Check bank account balance\n" +
                "2. Withdraw money\n" +
                "3. Deposit money\n" +
                "4. Close the app\n" +
                "\n" +
                "Which option do you choose? (1, 2, 3 or 4)"
        )
        option = (1..5).random()
        println("The selected option is ${option}.")
        when (option) {
            1 -> println("The current balance is $accountBalance dollars.")
            2 -> transfer("withdraw")
            3 -> transfer("deposit")
            4 -> {
                isSystemOpen = false
                println("The system is closed.")
            }
            else -> continue
        }
    }
}