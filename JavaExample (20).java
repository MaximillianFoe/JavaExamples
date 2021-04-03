package Lab6;

import java.util.Scanner;

public class Soru3 {
	public static void main(String[] args) {
		double a,b,c;
		Scanner in = new Scanner(System.in);
		System.out.print("A : ");
		a = in.nextDouble();
		System.out.print("B : ");
		b = in.nextDouble();
		c = Math.sqrt(a)+Math.pow(b, 2);
		System.out.print("C = A^(1/2) + B^2 = " + c);
	}
}
