package code;

public class Runner {
    public static void main(String[] args) {
        Fraction myFraction = new Fraction (2, 3);
        Fraction otherFraction = new Fraction (5);
        Fraction a = new Fraction ();
        Fraction product = myFraction.multiply(otherFraction);
        Fraction inversed = myFraction.inverse();
        System.out.println(inversed);

    }
}
