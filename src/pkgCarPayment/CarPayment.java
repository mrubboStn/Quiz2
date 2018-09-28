package pkgCarPayment;

import java.util.Scanner;
import java.lang.Math;

public class CarPayment {
	double totalPrice = 0;
	double downPayment = 0;
	double loanLength = 0;
	double interestRate = 0;
	double principal = 0;
	double monthlyPayment = 0;
	double totalInterest = 0;
	
	
	Scanner input = new Scanner(System.in);
	
	public double CarCost() {
		principal = totalPrice - downPayment;
		
		monthlyPayment = principal*((interestRate/12)*Math.pow((1+(interestRate/12)), loanLength))/(Math.pow((1+(interestRate/12)), loanLength)-1);
		double monthlyPaymentRounded = Math.round(monthlyPayment * 100.0) / 100.0;
		return monthlyPaymentRounded;
	}
	
	public double InterestRate() {
		totalInterest = (loanLength*monthlyPayment) - principal;
		double totalInterestRounded = Math.round(totalInterest * 100.0) / 100.0;
		return totalInterestRounded;
	}
	
	public CarPayment(double totalPrice, double downPayment, double loanLength, double interestRate){
		if ((totalPrice != 0) && (downPayment != 0) && (loanLength != 0) && (interestRate != 0)) {
			System.out.println("Input total price of car(sticker price + taxes + extras):");
			totalPrice = input.nextDouble();
			
			System.out.println("Input Down Payment:");
			downPayment = input.nextDouble();
			
			System.out.println("Input the length of the loan in months:");
			loanLength = input.nextDouble();
			
			System.out.println("Input yearly interest rate of loan:");
			interestRate = (input.nextDouble())/100;
		}
		
		System.out.println("This is your Monthly Payment:" + CarCost());
		System.out.println("This is the total amount of interest paid:" + InterestRate());		
	}
}
