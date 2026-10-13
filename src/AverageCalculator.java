/**
 * Exercise 8 — AverageCalculator
 *
 * Five test scores, all ints. Print the exact average as a decimal.
 *
 * With the scores below the true average is 87.4.
 * If your program prints 87.0, you've hit the integer division trap.
 * Fix it without changing the score variables to doubles.
 */
public class AverageCalculator {
    public static void main(String[] args) {
        int score1 = 88;
        int score2 = 92;
        int score3 = 79;
        int score4 = 95;
        int score5 = 83;

        int sum = score1 + score2 + score3 + score4 + score5;

        double mean = sum / 5.0;

        System.out.println("The average is: " + mean);

    }
}
