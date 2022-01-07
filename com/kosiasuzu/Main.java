package com.kosiasuzu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your buying price");
        double value = scanner.nextDouble();
        InvestmentEarningsCalculator.setBuyingPrice(value);

        InvestmentEarningCalculatorThread t = new InvestmentEarningCalculatorThread();
        t.start();

        System.out.println("Thank you for using my investments earnings calculator");
    }
}
