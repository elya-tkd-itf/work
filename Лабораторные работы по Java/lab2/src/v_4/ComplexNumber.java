package v_4;

import java.util.Scanner;

public class ComplexNumber {
    public static ComplexNumber getComplex(){
        System.out.println("Z = x + yi");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x > ");
        double x = scanner.nextDouble();
        System.out.print("Введите y > ");
        double y = scanner.nextDouble();
        return new ComplexNumber(x, y);
    }
    public double x, y;
    public ComplexNumber(double x, double y){
        this.x = x;
        this.y = y;
    }
    public ComplexNumber add(ComplexNumber cn){
        return new ComplexNumber(x + cn.x, y + cn.y);
    }
    public ComplexNumber mult(ComplexNumber cn){
        return new ComplexNumber(x*cn.x - y*cn.y, x*cn.y + y*cn.x);
    }
    public double getMod(){
        return Math.sqrt(x*x+y*y);
    }
    @Override
    public String toString(){
        return "" + x + ((y < 0)? y : "+"+ y) + "i";
    }
}
