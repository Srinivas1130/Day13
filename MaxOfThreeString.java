package com.bridgelabz.day13;
import java.util.Scanner;

public class MaxOfThreeString {
	public static String maxOfThreeName(String name1,String name2, String name3){
		String name;
		Integer num1=(Integer)name1.length();
		Integer num2=(Integer)name2.length();
		Integer num3=(Integer)name3.length();
		
		if ((num1.compareTo(num2)) > 0 && (num1.compareTo(num3)) > 0){
			name = name1;
		} else if (num2.compareTo(num3)>0){
			name = name2;
		}else{
			name = name3;
		}
		return name;
	}

	public static void main(String []args){
		System.out.println("Find maximum among 3 Names.");
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the first, second & third name's....");
		String name1=scanner.next();
		String name2=scanner.next();
		String name3=scanner.next();

		String maxName=maxOfThreeName(name1,name2,name3);
		System.out.println("The Largest Srting is: "+ maxName);
	}
}