# Exercise: Practice defining Classes, Methods and Functions

In this exercise, you will gain practical experience in defining custom classes, methods, and functions.

Remember, the purpose of this exercise is to practice and build on your existing knowledge. Take your time to complete the individual steps and refer to previous lessons if you feel the need to refresh your memory. Overview

## Instructions

## Scenario

Imagine you have secured a job with a game development company. Your first assignment is to create a small piece of code to hold the player data for one of their games. The requirements of your program are:

- Store and display the player’s full name
- Store, manipulate and display the player’s score data
- Store and display a personal best score (players get a score for each level played)
- Display the winning player’s name and their total score and their best level score

When all your code is completed you will have a final console output that simulates an end-of-game score. You will have two lines each with text and a player score.  (This is just an example of the output, you will input level sores later to produce a final result).

```
The winner is Nicola Tesla with a Score of 158
Personal Best Score is = 90
```

## Task 1: Data storage

In this task, you will use the variables of a class to store the player data.

### Step 1: Create a Player Class

Create a class called Player, using `val` create two String variables to hold the player first name in a variable `name` and their surname in the variable `surName`. Then implement a method called `fullName` that should return `String` with a name and surname in the format "name surname". The **name** and **surname** are known as **properties** or **members** of the `Player` class. The method `fullName` is also a member of the class, this is why it is referred to as a method, even though it is created the same way as every other function - using the `fun` keyword.

### Step 2: Initialise the Player class

In the main function, create two instances of the **Player** class with different variable names:

It should look like this:

```kotlin
val P1 = Player("Nicola", "Tesla")
val P2 = Player("Thomas", "Edison")
```

### Step 3: Test the new instances

In the main function, call the method `fullName` on your `Player` objects, then print the result to the console. This is a simple check to ensure your code is working correctly.

**Tip**: *If your code does not work correctly, check the ‘return’ part of your method code.*

## Task 2: Adding properties and functionality

Now you can proceed to expand the program to add properties and functionality.

### Step 1: Adding more properties to the Player class

You know from the requirements for the program, that you will have to store the player’s total score and also store their highest score from the levels they have played. To achieve this, you expand the **Player** class to have properties that can hold the player’s total score and best score.

Create two more variables in your `Player` class, you can use a `Double` as the type.

```kotlin
var totalScore = 0
var personalBestScore = 0
```

### Step 2: More functionality

You also know that you will need to process or work with these scores to be able to determine the best score achieved and to display the total score. To do this you will need some functions. To keep your code separate, and to enhance readability, let’s put these functions in their own class.

Create a class called **Scores**, in this class create a function to check if the score for the just completed level is better than the existing personal best score.

To achieve this, complete the following function by encapsulating the **if** statement.

**Tip:** *Remember to choose a name for your function that follows good practice. It should seem sensible when your code is viewed at a later date- by you or others.*

```kotlin
fun insert your function name here {
    if(best < current) { 
        return current 
    }
    return best
}
```

## **Task 3: Completing the code**

To finish your code, you will now make all the parts of your program work together.

### **Step 1: Prepare the main function**

In your main function declare a variable to represent the level score attained by each player:

```kotlin
var lvlScore = 0
```

You can use this variable to hardcode different values for each level your player has completed, let’s say there are only three levels. In a real game, this info would come directly from the game for as many levels as the game has or as many as the player completed. In this example you will assign scores of 20, 35, and 25.

**Tip:** *Remember that you will need to add these three scores for the player total score.*

You will also need an instance of the Score class to access your checking function.

Your prepared main function could look like this :

```kotlin
fun main() {
    val P1 = Player("Nicola", "Tesla")
    val P2 = Player("Thomas", "Edison")
    val scoring = Scores()
    var lvlScore = 0
    
    // level 1
    lvlScore = 20
    // delete this line and complete your code here
     
    // level 2
    lvlScore = 35
    // delete this line and complete your code here
    
    // level 3
    lvlScore = 25
    // delete this line and complete your code here
}
```

**Tip:** *As you should do with most of your coding, remember to test as you go, print each new item you create to the console. You will need to check the total scores of both players to decide on the winner.*

## Result of the completed code

Your final console output should be something like this:

```
Winner Nicola Tesla with a combined score of 80 and a personal best level score of 35
```

**Tip:** *Follow the correct naming conventions. The names of classes should begin with an uppercase letter and use camel-case. Example:*  `Player`. *When naming functions, properties and local variables: start the name with a lowercase letter, use camel-case and no underscores. Example:* `lvlScore`

## Concluding thoughts

In this exercise, you practiced defining custom classes, methods and functions, and worked with variables and properties.
