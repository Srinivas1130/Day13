package com.bridgelabz.day13;
import java.util.Scanner;

public class MaxOfThreeNoInt {

	public static int maximumThreeNumbers(int number1,int number2, int number3){

		int maximumNum;

		Integer num1 = (Integer) number1;
		Integer num2 = (Integer) number2;
		Integer num3 = (Integer) number3;

		if ((num1.compareTo(num2)) > 0 && (num1.compareTo(num3)) > 0 ) {
			maximumNum = number1;
		} else if (num2.compareTo(num3)>0){
			maximumNum  = number2;
		}else{
			maximumNum = number3;
		}
		return maximumNum;
	}
	public static void main(String []args){
		System.out.println("Find maximum among 3 numbers");
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the first, second & third no's....");
		
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		int num3=scanner.nextInt();

		int maximum=maximumThreeNumbers(num1,num2,num3);
		System.out.println("The Largest numbers is: "+ maximum);
	}
}
