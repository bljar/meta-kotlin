# Exercise: Write a unit test

## Overview
Earlier you discovered what a unit test is and why it is needed. 
In addition, you also explored how to set up an environment for creating unit tests in an Android project
and how to create unit tests for existing functions.

In this activity, you will practice writing unit tests for a given function of a program.

In a real-world scenario, remember that your code may be more than one test case, 
thereafter you will need to write several unit tests to examine each case. 
In this exercise, you will simulate that by building the second and third test functions.

By the time you complete this activity, you’ll be able to insert unit tests into your Android projects. 
That will increase source code quality and make it more reliable and maintainable, 
and lead to fewer unexpected problems and less risk when refactoring and introducing changes.

## Scenario
The Little Lemon restaurant wants to free space in its warehouse
and apply a 20% discount to the products that are running out of stock.
The maximum amount of product that makes it eligible for a discount is five units.

If the product is already out of stock, or its amount in stock exceeds 5, then the discount is not applied. 
You’re asked to write unit tests to ensure that the existing implementation of discounting logic works correctly.

## Definition of key topic
To start covering the program with unit tests, you must open the `Product` class. 
It has information about each product like its title, price and stock amount.
The `applyDiscount` method is the one that should be unit tested.

## Code for the Product class

```kotlin
data class Product(
    val title: String,
    var price: Double,
    var amount: Int
) {

    fun applyDiscount(discountPercent: Int) {
        if (amount in 1..5) {
            price -= (price * discountPercent / 100)
        }
    }

}
```

## Instructions

### Step 1: Setup a project
Copy the `Product` class code from above and paste it into a new file in an existing project.

### Step 2: Create a test class
Create a test class for `Product` following the steps mentioned in the video instructions.

### Step 3: Create the first test function
Inside the test class you just created, declare a test function for "Spaghetti" that costs 20.00.
The stock amount for this product is equal to 3.

💡 Tip: Keep in mind the AAA rule (Arrange-Act-Assert).

20% should be applied to this product as its `discountPercent`

### Step 4: Create the second test function
In the same manner, create a test function for the second case – "Steak" costing $30.00 with 8 in stock. 
Discount should not be applied.

### Step 5: Create the extra test function
As an extra step, create a test function for the last case – a "Lasagna" costing $10.00 that is out of stock.
What will be the outcome of this test? Do you think it will have a discount or not?

💡 Tip: Read the exercise task carefully and examine the `applyDiscount()` function body.

## Conclusion
By completing this exercise, you demonstrated your ability to cover a function with unit tests for several test cases.
As you build Android projects, you’ll learn how unit testing improves the code quality 
and increases the quality of your apps, 
and in addition, it makes the source code updates easier to process.