package com.bridgelabz.day13;
import java.util.Scanner;

public class MaxOfThreeNoFloat {
	public static float maximumThreeNumbers(float number1,float number2, float number3){

		float maximumNum;

		Float num1 = (Float) number1;
		Float num2 = (Float) number2;
		Float num3 = (Float) number3;

		if ((num1.compareTo(num2)) > 0.0 && (num1.compareTo(num3)) > 0.0){
			maximumNum = number1;
		} else if (num2.compareTo(num3) >0.0){
			maximumNum  = number2;
		}else{
			maximumNum = number3;
		}
		return maximumNum;
	}
	public static void main(String []args){
		System.out.println("Find maximum among 3 numbers.");
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the first, second & third no's....");

		float num1=scanner.nextFloat();
		float num2=scanner.nextFloat();
		float num3=scanner.nextFloat();

		float maximum=maximumThreeNumbers(num1,num2,num3);
		System.out.println("The Largest numbers is: "+ maximum);
	}
}
