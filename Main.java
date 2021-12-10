
////////////////////////////////////////////////////////////////////////////////////

// Garrett Wiese

// Doug Lundin

// CSC 160 Computer Science I

// October 28th, 2021

// Homework 8, Programming Exercise 8.11, Page 311, Heads and Tails

////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter any number between 0 and 511: ");

        int intInput = input.nextInt();

        if (intInput > 511) {
            System.out.println("The number you entered is greater than the maximum set which is 511!");
        } else {
            String result = Integer.toBinaryString(intInput);

            String resultWithPadding = String.format("%9s", result).replaceAll(" ", "0");

            String done = resultWithPadding.replace("0", "H");

            String doneTwo = resultWithPadding.replace("1", "T");

            char[][] matrix = new char[3][3];

            if (done.charAt(0) == 'H') {
                matrix[0][0] = done.charAt(0);
            } else {
                if (doneTwo.charAt(0) == 'T') {
                    matrix[0][0] = doneTwo.charAt(0);
                }
            }
            if (done.charAt(1) == 'H') {
                matrix[0][1] = done.charAt(1);
            } else {
                if (doneTwo.charAt(1) == 'T') {
                    matrix[0][1] = doneTwo.charAt(1);
                }
            }
            if (done.charAt(2) == 'H') {
                matrix[0][2] = done.charAt(2);
            } else {
                if (doneTwo.charAt(2) == 'T') {
                    matrix[0][2] = doneTwo.charAt(2);
                }
            }
            if (done.charAt(3) == 'H') {
                matrix[1][0] = done.charAt(3);
            } else {
                if (doneTwo.charAt(3) == 'T') {
                    matrix[1][0] = doneTwo.charAt(3);
                }
            }
            if (done.charAt(4) == 'H') {
                matrix[1][1] = done.charAt(4);
            } else {
                if (doneTwo.charAt(4) == 'T') {
                    matrix[1][1] = doneTwo.charAt(4);
                }
            }
            if (done.charAt(5) == 'H') {
                matrix[1][2] = done.charAt(5);
            } else {
                if (doneTwo.charAt(5) == 'T') {
                    matrix[1][2] = doneTwo.charAt(5);
                }
            }
            if (done.charAt(6) == 'H') {
                matrix[2][0] = done.charAt(6);
            } else {
                if (doneTwo.charAt(6) == 'T') {
                    matrix[2][0] = doneTwo.charAt(6);
                }
            }
            if (done.charAt(7) == 'H') {
                matrix[2][1] = done.charAt(7);
            } else {
                if (doneTwo.charAt(7) == 'T') {
                    matrix[2][1] = doneTwo.charAt(7);
                }
            }
            matrix[2][2] = done.charAt(8);
            if (done.charAt(8) == 'H') {
                matrix[2][2] = done.charAt(8);
            } else {
                if (doneTwo.charAt(8) == 'T') {
                    matrix[2][2] = doneTwo.charAt(8);
                }
            }

            System.out.println("The number you entered: " + intInput + "\n");

            System.out.println("The number you entered represented as Binary: " + resultWithPadding + "\n");

            System.out.println("The Heads and Tails game using the number converted to binary follows below with H's representing 0's in the binary number & T's representing the 1's in the binary number. " + "\n");

            System.out.println("|" + " Head and Tails" + "|");

            System.out.println("_" + "_" + "_" + "_" + "_" + "_" + "_" + "_" + "_");

            System.out.println("|" + " " + matrix[0][0] + " " + matrix[0][1] + " " + matrix[0][2] + " |");

            System.out.println("|" + " " + matrix[1][0] + " " + matrix[1][1] + " " + matrix[1][2] + " |");

            System.out.println("|" + " " + matrix[2][0] + " " + matrix[2][1] + " " + matrix[2][2] + " |");

            System.out.println("-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-");

        }
    }
}