import java.util.Scanner;

public class ArraysAndMethods {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // TODO 1: Ask the user "Enter the total number of scores: "
        System.out.print("Enter the total number of scores: ");
        
        
        // TODO 2: Read the number and create an int[] array of that size
        int size = input.nextInt();
        int[] scores = new int[size];
        
        
        // TODO 3: Create a for-loop to ask for each score and store it in your array
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Score: ");
            scores[i] = input.nextInt();
        }
        
        
        System.out.print("Scores: ");
        // TODO 4: Call your print() method and pass it your array!
        print(scores);
        
        
        // TODO 5: Call your getSum() method, store the result, and print it
        double sum = getSum(scores);
        System.out.println("Sum: " + sum);
        
        
        // TODO 6: Call your getAvg() method, store the result, and print it
        double avg = getAvg(scores);
        System.out.println("Average grade: " + avg);
        
        
        // TODO 7: Call your getGradeByAVG() method (pass the average), and print the letter grade
        String letterGrade = getGradeByAVG(avg);
        System.out.println("Letter grade: " + letterGrade);
        
        // TODO 8: Call your findMaxGrade() method and print the highest score
        int maxScore = findMaxGrade(scores);
        System.out.println("Highest score: " + maxScore);
        
        input.close();
    }

    // --- HELPER METHODS BELOW ---

    // TODO 9: Implement print()
    // It should take an int[] array as a parameter.
    // Loop through the array and print the numbers separated by commas. 
    // ADVERSARIAL HINT: Use an if-statement to ensure the last number doesn't get a comma!
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    
    
    // TODO 10: Implement getSum()
    // It should take an int[] array, loop through it to add up all the numbers, and RETURN a double.
    public static double getSum(int[] array) {
        double total = 0.0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }
    
    
    // TODO 11: Implement getAvg()
    // It should take an int[] array. Call your getSum() method, divide by the array length, and RETURN the average.
    public static double getAvg(int[] array) {
        if (array.length == 0) {
            return 0.0;
        }
        return getSum(array) / array.length;
    }
    
    
    // TODO 12: Implement getGradeByAVG()
    // It should take a double parameter. Use if/else if statements to determine the letter grade and RETURN it as a String.
    public static String getGradeByAVG(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    
    
    // TODO 13: Implement findMaxGrade()
    // It should take an int[] array. Find the largest number and RETURN it.
    // ADVERSARIAL HINT: Start your max tracking variable at array[0], NOT 0!
     public static int findMaxGrade(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    
}
    
    
}
