# Arrays And Methods 📊

### Welcome!
This GitHub repository is where you can work and submit your `ArraysAndMethods.java` activity!

```text
Note: Please read all the information below before starting the activity!
```

For detailed instructions, you can check the presentation here: [Arrays And Methods Presentation](https://docs.google.com/presentation/d/1Pp_LTrwcFWHIyvkbwlTE5ynyz6TrR-Pdnu4VJuIfEGI/edit?usp=sharing).

---

## Activity Instructions

In this activity, you will combine arrays with modular programming. Instead of writing all your code inside the `main` method, you will create specialized helper methods to calculate sums, averages, and letter grades, and then call them from your `main` method!

**Part 1: Build the Helper Methods**
Outside of your `main` method, implement the following static methods:
1. `print(int[] array)`: Takes an array of ints and prints its contents (e.g., `100, 95`).
2. `getSum(int[] array)`: Takes an array of ints, adds them all together, and returns the sum as a `double`.
3. `getAvg(int[] array)`: Takes an array of ints, calls `getSum()` to get the total, and returns the calculated average as a `double`.
4. `getGradeByAVG(double average)`: Takes the average as a parameter and returns a `String` representing the letter grade based on this scale:
    * A: 90-100 | B: 80-89 | C: 70-79 | D: 60-69 | F: Below 60
5. `findMaxGrade(int[] array)`: Takes an array of ints, finds the highest score, and returns it.

**Part 2: The Main Method**
Inside your `main` method:
1. Ask the user to enter the total number of scores they want to store.
2. Create an array of integers with that specific size.
3. Use a loop to ask the user for each score and store it in the array.
4. Call all of your helper methods to calculate and print the expected output!

> [!WARNING]
> ### 👾 Break-Proofing Your Code (Adversarial Thinking):
> * **Integer Division Trap:** If you divide an `int` by an `int`, Java throws away the decimal! For example, `195 / 2` becomes `97` instead of `97.5`. Make sure your sum is stored as a `double` before you divide it by the array length!
> * **Finding the Max:** When finding the maximum value in an array, never set your starting `max` variable to `0`! What if all the scores are negative? Always initialize your `max` variable to the first element in the array (e.g., `array[0]`).
> * **Comma Formatting:** When printing the array, notice that the last number does *not* have a comma after it. You will need an `if/else` statement inside your print loop to check if you are at the last index (`array.length - 1`).

### Expected Output
```text
Enter the total number of scores: 2
Score: 100
Score: 95
Scores: 100, 95
Sum: 195.0
Average grade: 97.5
Letter grade: A
Highest score: 100
```

> [!IMPORTANT]
> ### How to submit your activity:

<details>
<summary> If you're using your own VS Code (Recommended):</summary>

```text
1. In your GitHub assignment, open the file with the name of the program that you want to submit.
2. Click the pencil icon ("edit this file") in the right upper corner.
3. Paste the code from your VS Code into GitHub
4. Click "Commit changes" (Green button in right upper corner).
5. Accept/confirm any prompts, and that's it! You've submitted your activity.
```
</details>

<details>
<summary> If you're using GitHub Codespaces:</summary>

```text
1. Whenever you're ready to submit the activity, click on the "Source Control" tab (usually on the left of your screen).
2. Write your Student ID in the Message textbox (above the green "Commit" button). 
3. Click on commit (if prompted to stage changes, click "Yes").
4. Click on the button "Sync changes", accept everything and that's it!
If you didn't get any errors, you've submitted your activity successfully. Otherwise, send me a message with your error.
```
</details>
