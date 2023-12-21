package ques;

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter basic salary: ");
		int BS = sc.nextInt();
		double DA = 0.40 * BS;
		double HRA = 0.20 * BS;
		double GS = BS + DA + HRA;
		System.out.println("Basic Salary is "+ BS);
		System.out.println("DA is "+ DA);
		System.out.println("HRA is "+ HRA);
		System.out.println("Gross Salary is "+GS);
	}

}
