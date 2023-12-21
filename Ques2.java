package ques;

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance in km=");
		int km = sc.nextInt();
		System.out.println(km+ "km is "+(km*1000)+" meters");
		System.out.println(km+ "km is "+(km*3280.8399)+" feet");
		System.out.println(km+ "km is "+(km*39370.0787)+" inch");
		System.out.println(km+ "km is "+(km*100000)+" centimeters");
	}

}
