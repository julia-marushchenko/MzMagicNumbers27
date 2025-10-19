// Java program to find numbers dividable by 3

// Main class
public class Main {

    // Main method
    public static void main(String[] args) {

        // Creating array of numbers
        int[][] arr = new int[12][6];

        // Filling the array with numbers
        for (int index0 = 0; index0 < arr.length; index0++) {
            for (int index = 0; index < arr[index0].length; index++) {

                // Adding values
                arr[index0][index] = index0;

            }
        }

        // Printing three-dimensional array to console
        for (int index0 = 0; index0 < arr.length; index0++) {
            for (int index = 0; index < arr[index0].length; index++) {

                int number1 = arr[index0].length - 1;
                System.out.print(arr[index0][index] + " ");
                if (index == number1) {
                    System.out.println();
                }
            }
        }

        // Checking if numbers are dividable by 3 and printing to console

        for (int index0 = 0; index0 < arr.length; index0++) {
            for (int index = 0; index < arr[index0].length; index++) {

                // Condition
               if (arr[index0][index] % 3 == 0) {

                   // Printing the result to console
                   System.out.println(arr[index0][index] + " is dividable by 3");
               } else {

                   // Printing the result to console
                   System.out.println(arr[index0][index] + " is not dividable by 3");
               }
            }
        }
    }
}