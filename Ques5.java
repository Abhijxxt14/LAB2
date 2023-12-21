package ques;

import java.util.Scanner;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the hemisphere:: ");
		double r = sc.nextDouble();
		double area = 3*Math.PI*Math.pow(r,2);
		double volume = (2.0/3)*Math.PI*r*r*r;
		System.out.println("The surface area of the hemisphere is "+ area);
		System.out.println("The volume area of the hemisphere is "+ volume);
	}

}
