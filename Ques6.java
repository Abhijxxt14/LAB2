package ques;

import java.util.Scanner;

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of seconds: ");
		double t = sc.nextDouble();
		double g = 32.174;
		double d = 0.5*g*Math.pow(t,2);
		System.out.println("Distance traveled: "+ d);
	}

}
