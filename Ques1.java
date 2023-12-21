package ques;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
System.out.println("Enter a degree in Fahrenheit: ");
double F = sc.nextDouble();
double C = (5.0/9)*(F-32);
System.out.println(F+ "Fahrenheit is "+C+" Celsius");
	}

}
