package org.example.gb.ex2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.print("Enter the second number: ");
        double b = Double.parseDouble(sc.nextLine());
        try{
            System.out.printf("Division result: %f", divide(a, b));
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
    public static double divide(double a, double b) throws DivisionByZeroException {
        if(b == 0)throw new DivisionByZeroException("Division by zero is not allowed");
        return a/b;
    }
}
