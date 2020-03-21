package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter number 1: ");
            var x = input.nextFloat();
            System.out.print("Please enter number 2: ");
            var y = input.nextFloat();
            input.nextLine();
            System.out.print("Please enter operation (+,-, *,/): ");
            var op = input.nextLine();
            var result = Calculator.calculate(x,y,op);
            if(result.isSuccess()){
                System.out.println(result.getResult());
            } else {
                System.out.println(result.getErrorMessage());
                continue;
            }
            System.out.println("Do you want to continue? (Y/N): ");
            var cont = input.nextLine();
            if (cont.toUpperCase().equals("Y")) {
                continue;
            } break;
        }
    }
}