package utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Utils {

    //bubleSort
    public static class BubbleSort {
        static void bubbleSort(int[] arr) {
            int n = arr.length;
            int temp = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 1; j < (n - i); j++) {
                    if (arr[j - 1] > arr[j]) {
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }

    //iterative method to reverse String in Java
    public static String reverse(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] strChars = string.toCharArray();
        for (int i = strChars.length - 1; i >= 0; i--) {
            stringBuilder.append(strChars[i]);
        }

        return stringBuilder.toString();
    }

    //OddEvenNumber
    public static void oddEvenNumbers(int[] array) {
        // Вывод четных элементов массива на экран.
        System.out.print("Четные элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ", ");
            }
        }
//   Вывод нечетных элементов массива на экран.
        System.out.print("\nНетные элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + ", ");
            }
        }
    }

    //Recursion
    public static int countRecursive(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        return 1 + countRecursive(Arrays.copyOfRange(array, 1, array.length));
    }

    public static int sum(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        return array[0] + sum(Arrays.copyOfRange(array, 1, array.length));
    }

    public static int maxMin(int[] array) {

        if (array.length == 2)
            return array[0] > array[1] ? array[0] : array[1];

        int subMax = maxMin(Arrays.copyOfRange(array, 1, array.length));
        //int subMin = maxMin(Arrays.copyOfRange(array, 1, array.length));

        return array[0] > subMax ? array[0] : subMax;
        //return array[0] < subMin ? array[0] : subMax;
    }

    //PrimeNumber
    public static void checkPrime(int n) {
        int m, flag = 0;
        m = n / 2;

        if (n == 0 || n == 1) {
            System.out.println(n + " is not a Prime Number");
        } else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not a Prime Number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.println(n + " it's a Prime Number");
        }
    }

    //Matrix Operations
    public static void multiplicationMatrix(int[][] array1, int[][] array2, int[][] result) {
        System.out.println("\nMultiplication two matrix: ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                for (int k = 0; k < array1[0].length; k++) {
                    result[i][j] += array1[i][k] * array2[k][j];
                }
                System.out.printf(" " + result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void substractionMatrix(int[][] array1, int[][] array2, int[][] result) {
        System.out.println("\nDifference of two matrices: " + "A -" + " B: ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                result[i][j] = array1[i][j] - array2[i][j];
                result[i][j] = array1[i][j] / array2[i][j]; //same code for division, addition
                result[i][j] = array1[i][j] + array2[i][j];
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nDifference of two matrices: " + "B -" + " A: ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                result[i][j] = array2[i][j] - array1[i][j];
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //Matrix Diagonal Operations
    public static void printDiagonalSums(int[][] array, int n) {
        int principal = 0;
        int secondary = 0;
        for (int i = 0; i < n; i++) {
            principal += array[i][i];
            secondary += array[i][n - i - 1];
        }
    }

    public static void printMainDiagonalAboveBelow(int[][] arrray, int n) {
        int above = 0;
        int below = 0;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (j > i) {
                    above += arrray[i][j];
                } else {
                    if (i > j) {
                        below += arrray[i][j];
                    }
                }
            }
        }
    }

    public static void difference(int[][] array, int n) {
        // Initialize sums of diagonals
        int principal = 0;
        int secondry = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // finding sum of primary diagonal
                if (i == j)
                    principal += array[i][j];
                // finding sum of secondary diagonal
                if (i == n - j - 1)
                    secondry += array[i][j];
            }
        }
        // Absolute difference of the sums  // across the diagonals
        System.out.println("Absolute difference of the sums: " + Math.abs(principal - secondry));
    }

    public static void swapDiagonals(int[][] array, int n) {
        // swap elements of diagonal
        for (int i = 0; i < n; ++i)
            if (i != n / 2) {
                int temp = array[i][i];
                array[i][i] = array[i][n - i - 1];
                array[i][n - i - 1] = temp;
            }
        System.out.println("InterchangeDiagonals(swap): ");
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j)
                System.out.print(" " + array[i][j] + " ");
            System.out.println();
        }
    }

    //Swap2Number
    public static void swapTwoNumber() {
        int a = 0, b = 0;

        a = a + b;
        b = a - b;
        a = a - b;
    }

    // numbers from 1 to 100 or 1 - 1000
    public static int getMissingNumber(int[] numbers, int totalCount) {
        int expectedSum = totalCount * ((totalCount + 1) / 2);
        int actualSum = 0;
        for (int i : numbers) {
            actualSum += i;
        }
        System.out.printf("Missing number in array %s is %d %n",
                Arrays.toString(numbers), expectedSum - actualSum);
        return expectedSum - actualSum;
    }

    public static boolean isAnagram(String word, String anagram) {
        if (word.length() != anagram.length()) {
            return false;
        }
        char[] chars = word.toCharArray();

        for (char c : chars) {
            int index = anagram.indexOf(c);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1);
            } else {
                return false;
            }
        }
        return anagram.isEmpty();
    }

    public static void printDuplicateCharacters(String word) {
        char[] characters = word.toCharArray();

        // build HashMap with character and number of times they appear in String
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (Character ch : characters) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }
        // Iterate through HashMap to print all duplicate characters of String
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        System.out.printf("List of duplicate characters in String '%s' %n", word);
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }

    public static void removeDuplicates(int[] arrayWithDuplicates) {
        for (int i = 0; i < arrayWithDuplicates.length; i++) {
            System.out.println(arrayWithDuplicates[i] + "\t");
        }
        //Assuming all elements in input array are unique

        int noOfUniqueElements = arrayWithDuplicates.length;

        //Comparing each element with all other elements

        for (int i = 0; i < noOfUniqueElements; i++) {
            for (int j = i + 1; j < noOfUniqueElements; j++) {
                // If any two elements are found equal

                if (arrayWithDuplicates[i] == arrayWithDuplicates[j]) {
                    //Replace duplicates element with last unique element

                    arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements - 1];
                    //Decrementing noOfUniqueElements

                    noOfUniqueElements--;

                    //Decrementing

                    j--;

                }
            }
        }
        //Copying only unique elements of arrayWithDuplicates into arrayWithoutDuplicates
        int[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, noOfUniqueElements);
    }

    //Palindrome
    public static void palindrome(String original) {
        String reverse = "";
        int length = original.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);

        if (original.equals(reverse))
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string isn't a palindrome.");

    }


    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static double factorial(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }

        return n * factorial(n - 1);
    }


// 19
//BuubleSort
//StringReverse
//Palindrome
//GetMissingNumber
//Fibonaci
//PrimeNumber
//Factorial
//CheckAnagram
//MatrixDiagonal Operations(Swap, Difference, AboveBelowDiagonals, SumDiagonals)
//TwoMatrixOperations(Multiplication, Substraction, Addition, Division)
//RecursionBonus(Count, MinMax, Sum)

}
