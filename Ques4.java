package ques;

import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number between 0 and 1000: ");
		int No = sc.nextInt();
		int lastDigit = No%10;
		int middleDigit = (No%100)/10;
		int firstDigit = No/100;
		int sum = firstDigit + middleDigit + lastDigit;
		System.out.println("The sum of the digits is "+ sum);
	}

}
