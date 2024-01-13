package ques;

public class CMD3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int minR = Integer.parseInt(args[0]);
		int maxR = Integer.parseInt(args[1]);
		int fNumber = (int)(Math.random()*(maxR-minR+1)) + minR;
		int sNumber = (int)(Math.random()*(maxR-minR+1)) + minR;
		int sum = sNumber + fNumber;
		System.out.println("Sum of two random integers "+fNumber+" and "+sNumber + "is"+ sum);
	}

}
