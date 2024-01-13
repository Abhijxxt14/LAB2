package ques;

public class CMD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend = Integer.parseInt(args[0]);
		int divisor = Integer.parseInt(args[1]);
		int quotient = dividend/divisor;
		int remainder = dividend%divisor;
		System.out.println("Quotient = "+quotient+" and Remainder = "+remainder);

	}

}
