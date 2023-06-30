# Exercise: Extensions

## Overview
Earlier, you explored the uses and limitations of extension functions.
In this activity, you'll practice extending the functionality of classes by implementing extension functions. 
This will enable you to enrich the functionality of classes
and write cleaner code in your career as an Android developer.

## Scenario
The use-case you have is that Little Lemon wants to print out a report of all the ingredients in each of its dishes. 
It also wants to make these dishes healthier by removing salt from them.
You've been asked to create extension functions that will print the ingredients report
and remove the ingredient "salt" from dishes.

## Definition of key topic
To practice the use of extension functions,
you will add some functionality to Little Lemon's Dish class. 
First, you will print out the list of ingredients for a dish.
Then, you will add an extension function that removes salt from the list of ingredients of a dish.

## Instructions

### Step 1: Exercise setup
Start by declaring the `Dish` class at the top of the code:

```kotlin
class Dish( 
    val dishName: String, 
    val ingredients: MutableList<String> 
)
```

### Step 2: Print out the list of ingredients
Next, you will enrich this class with additional functionality 
by extending `Dish` with a function that prints out the list of ingredients.
Start by declaring an extension function on `Dish` called `printIngredients()`.

Then, in the function body, call `println` to print out the ingredients list.

Lastly, in the `main()` function, instantiate `Dish` with "Onion Soup" as the dish name
and the following ingredients (note that these are case-sensitive): "Onion", "Cheese", "Water" and "Salt". 
Assign it to a variable named `onionSoup`. 
Call `printIngredients()` on the new `Dish` instance (stored in `onionSoup`).

You should see the ingredients (onion, cheese, water and salt) listed.

In the next step, you will enrich the `Dish` class with the functionality to remove salt from its list of ingredients.

### Step3: Remove salt from ingredients
In this step, you will introduce an extension function to remove salt from the ingredients of a dish.

Start by declaring an extension function on `Dish` called `removeSalt()`.

Next, in the function body, 
call remove on the ingredients list,
passing in “Salt” (case-sensitive) as an input.

To validate your changes,
add a call to `removeSalt` on the `Dish` instance you introduced in Step 2 (stored in `onionSoup`) before the call to `printIngredients()`.

If you run the code now, you should see the ingredients listed without salt.
The list just has onion, cheese and water.

## Conclusion

By completing this exercise, 
you demonstrated your ability to extend the functionality of classes using extension functions. 
This will prove to be a valuable skill because you will apply it often when you work with classes as an Android developer.