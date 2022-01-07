package com.kosiasuzu;

import java.util.Scanner;

public class InvestmentEarningsCalculator{
    private static double buyingPrice;
    private static int days = 0;
    private static double earnings;

    static void setBuyingPrice(double x){
        buyingPrice = x;

    }
    static double getBuyingPrice(){
        return buyingPrice;
    }

    public static int getDaysPassed(){
        return days;
    }

    public static double getEarnings(){
        return earnings;
    }

    public static void runCalculator(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            days++;
            System.out.println("Entering closing price for day " + days + " .. ");
            double closingPrice = scanner.nextDouble();

            if (closingPrice < 0.00) break;

            earnings = closingPrice - buyingPrice;

            if (earnings > 0){
                System.out.printf("After day %d you earned %.2f \n", days,earnings);
            } else if (earnings < 0) {
                System.out.printf("After day %d you lost %.2f \n",days, earnings);
            } else {
                System.out.println("After day "+ days + "you made no earning nor loss, buying price and closing price are the same");
            }
        }
        scanner.close();
    }
}
