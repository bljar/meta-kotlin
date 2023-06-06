# Exercise: Practice using math operators in Kotlin

## **. Also, declare another variable Overview**

In this exercise, you will practice working with a variety of math operators on numbers. In this way, you will use Kotlin to determine the results of several math equations.

## **Scenario**

## **Instructions**

## **Task 1: Perform operations on numbers**

### **Step 1: Create and print math operations**

Earlier, you learned that a print statement allows you to output something to the console. For the following steps, you will use the print statement to print the result of math operations.

1. In a new line, insert the keyword **println** followed by parentheses. It should read like this:
    
    ```kotlin
    println()
    ```
    
2. Suppose you are creating a simple game with multiple levels. After completing each level, the player receives a score. In such an app, you would need to use operators and data types to calculate many values, including such figures as the player’s performance in each level, total game score , and average scores. In this exercise, you will practice using math operators to calculate different values. First, you will create calculations using just numbers. Then, in task 2 and task 3, you will build calculations that operate on variables.**Average Score:** Next, inside the parentheses, write the mathematical operation: `123 + 456 * 789`
3. This mathematical expression will be performed, and the result will be displayed in the console when the print statement is executed.
4. Now it's time to run your code. Run your program and write down the output.

The output at this point should be **359907**.

### **Step 2: Perform a longer calculation**

Repeat the **println** code from step 1 to perform this longer calculation. Write down the result.

```kotlin
1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9
```

### **Step 3: Perform a calculation with parentheses**

Repeat the **println** code from step 1 to perform this calculation. It has the same numbers as the calculation in step 2, but this time it includes parentheses to control the sequence of the calculation.  Write down the result.

```kotlin
(1 + 2) * 3 + 4 * 5 + 6 * (7 + 8) * 9
```

### **Step 4: Perform a division calculation**

Repeat the **println** code from step 1 to perform this calculation. It is a division calculation using two float-type numbers.  Write down the result.

```kotlin
13530.0 / 1.23
```

## **Task 2: Perform math operations on variables**

In task 1, you performed math calculations using numbers. It’s possible that your code will contain such calculations, but typically, you will operate on variables rather than with actual numbers. In the following steps, you will use variables in math operations.

To begin with, let’s work with the type of code you might see in any game app. For instance, we will calculate the **total** **game score and an **average** game score.

### **Step 1: Create variables and assign values**

Let’s say each level has a maximum score of 100, and the scores the player got for each level are as follows:

| Level | Score |
|-------|-------|
| 1     | 79    |
| 2     | 92    |
| 3     | 86    |

Declare 3 variables using the **val** keyword, one for each level:

```kotlin
val scoreLevel1 = 79
val scoreLevel2 = 92
val scoreLevel3 = 86
```

### **Step 2: Create and print the total and average scores**

Create two more variables named `totalScore` ****and `averageScore`. These will hold the results of your calculations.

**Total Score:** Add up the scores to set the value of the `totalScore` ****variable.

For the `averageScore` variable, divide the total score by the number of levels.

Print the value of the `totalScore` ****and `averageScore`.

```kotlin
val totalScore = scoreLevel1 + scoreLevel2 + scoreLevel3
val averageScore = totalScore / 3
println(totalScore)
println(averageScore)
```

## **Task 3: Perform more operations on variables**

As the player continues in the game, you need to keep their interest and attention. Often this is done by providing the player a bonus chance to dramatically improve their score. Let’s say at the end there’s a bonus level. A player's score in that bonus level is multiplied by the `totalScore` to yield the final game score.

In this task, you’ll calculate the extra bonus level points to be added to the score and the final score at the end of the game. The calculation will use three variables, one existing variable for the `totalScore`, one for a `boostMultiplier` (that indicates the value with which the `totalScore` will be multiplied by) and another variable for the final boosted score. The final boosted value will be formed when you multiply the `totalScore` by the `boostMultiplier`.

**Step 1: Create variables and assign values**

You already have the `totalScore` variable from task 2. Now, declare the variable `boostMultiplier`, and let’s assign it a value of **4.** Also, Declare another variable ****`scoreBoost`, which will be calculated by multiplying the `boostMultiplier` and `totalScore`. Finally, declare a variable `finalBoostedScore`**,** which will be the final score at the end of the game (calculated as `totalScore` **+** `scoreBoost`)

```kotlin
val boostMultiplier= 4
val scoreBoost= totalScore * boostMultiplier
val finalBoostedScore = totalScore+scoreBoost
```

### **Step 2: Create and print math operations**

You have calculated the `scoreBoost` and then added it to the `totalScore` to set the value of the `finalBoostedScore` ****score variable. Now it’s time to print these.

```kotlin
println(scoreBoost)
println(finalBoostedScore)
```

## **Concluding thoughts**

In this exercise, you practiced using a variety of operators on different numbers. This work prepares you for your future programming, where math calculations will often be part of the code.

**Tip:** *Remember that math operations can be carried out on both positive and negative numbers.*