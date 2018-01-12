package code;

public class Fraction {
    private int num, denom;

    public Fraction (int num, int denom){
        if (denom == 0) {
            throw new IllegalArgumentException();
        }
        else {
        }
        this.num = num;
        this.denom = denom;
        simplify();
    }

    public Fraction(int num) {
        this (num, 1);
    }

    public Fraction(Fraction other){
        num = other.num;
        denom = other.denom;
    }

    public Fraction(){
        this.num = 0;
        this.denom = 0;
    }

    public String toString() {
        return num + " / " + denom;
     }

    public Fraction multiply(Fraction f) {
        return new Fraction(num*f.num, denom*f.denom);
    }

    public Fraction inverse() {
        int copy = num;
        num = denom;
        denom = copy;
        return  new Fraction (num, denom);
    }

    public Fraction divide (Fraction f) {
        return new Fraction (num * f.denom, denom*f.num);
    }

    private void simplify() {
        //find gcf
        int min = Math.min(num, denom);
        for (int i = min; i > 0; i--) {
            if (num % i == 0 && denom % i == 0) {
                num /= i;
                denom /= i;
                break;
            }
        }
    }

}


