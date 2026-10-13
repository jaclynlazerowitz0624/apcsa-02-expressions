/**
 * Exercise 6 — TipCalculator
 *
 * Given a bill amount, a tip percentage, and a number of people,
 * print the tip, the total, and each person's share —
 * all rounded to exactly 2 decimal places.
 *
 * Rounding to 2 decimals:
 *   Math.round(value * 100) / 100.0
 *
 * Watch that .0 — leave it off and you're back in integer division.
 */
public class TipCalculator {
    public static void main(String[] args) {
        double billAmount = 87.35;
        int tipPercent = 18;
        int people = 4;

        double tip = billAmount * (tipPercent / 100.0);
        double rTip = Math.round(tip * 100) / 100.0;

        double total = billAmount + rTip;
        double rTotal = Math.round(tip * 100) / 100.0;

        double share = rTotal / people;
        double rShare = Math.round(share * 100) / 100.0;

        double fTotal = rTotal + billAmount;

        System.out.println("Tip: $" + rTip);
        System.out.println("Total: $" + fTotal);
        System.out.println("Each person's share: $" + rShare);

    }
}
