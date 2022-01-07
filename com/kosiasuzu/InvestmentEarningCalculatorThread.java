package com.kosiasuzu;

public class InvestmentEarningCalculatorThread extends Thread{
    public void run(){
        InvestmentEarningsCalculator.runCalculator();
    }
}
