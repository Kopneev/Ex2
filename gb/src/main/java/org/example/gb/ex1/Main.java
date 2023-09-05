package org.example.gb.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(sc.next());
        try{
            throwIfNumberIsNegative(number);
            System.out.println("The number is correct: ");
        }
        catch (InvalidNumberException e){
            System.out.println(e.getMessage());
        }
    }
    public static void throwIfNumberIsNegative(int n) throws InvalidNumberException {
        if(n < 0)throw new InvalidNumberException("Invalid number");
    }
}
