// package src.questions;
public class JavaQuest4 {
    /**
     * Exercise: Print 10 numbers: they must be even and > 0, and divisible by 3 (Search it from 0)
     * 
     * Expected Output: 6 12 18 24 30 36 42 48 54 60
     */
    public static void main(String[] args) {
        // Print the first 10 numbers from 0:
        // 1. Even numbers
        // 2. Divisible by 3
        // 3. > 0
        int num = 0;
        for (int i = 0; i < 100; i++) { // You cannot change this line
            // code here ...
            if (num == 10) {
                break;
            }
            if (i % 2 == 0 && i % 3 == 0 && i > 0) {
                num += 1;
                System.out.print(i + " ");

            }
        }
    }
}
