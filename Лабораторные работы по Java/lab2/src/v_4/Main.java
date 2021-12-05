package v_4;

public class Main {

    public static void main(String[] args) {
        ComplexNumber complex1 = ComplexNumber.getComplex();
        ComplexNumber complex2 = ComplexNumber.getComplex();

        ComplexNumber complexSum = complex1.add(complex2);
        ComplexNumber complexMult = complex1.mult(complex2);

        double mod1 = complex1.getMod();
        double mod2 = complex2.getMod();

        System.out.println("complex1 " + complex1);
        System.out.println("complex2 " + complex2);
        System.out.println("complexSum " + complexSum);
        System.out.println("complexMult " + complexMult);
        System.out.println("mod1 " + mod1);
        System.out.println("mod2 " + mod2);
    }
}
