package com.bridgelabz.day13;
import java.util.Scanner;

public class RefactorUc4 {

	public static <R extends Comparable> void maxNumsGenerics(R name1,R name2,R name3){
		R maximum;
		if ((name1.compareTo(name2)) > 0 && (name1.compareTo(name3)) > 0){
			maximum = name1;
		} else if (name2.compareTo(name3)>0){
			maximum = name2;
		} else{
			maximum = name3;
		}
		System.out.println("The maximun among three is " + maximum);
	}
	
	public static void main(String []args){

		System.out.println("Find maximum among 3 numbers using Generics.");
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the first, second & third no's....");
		int name1=scanner.nextInt();
		int name2=scanner.nextInt();
		int name3=scanner.nextInt();
		maxNumsGenerics(name1,name2,name3);
	}
}
