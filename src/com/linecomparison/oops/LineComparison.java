package com.linecomparison.oops;

import java.util.Scanner;

public class LineComparison {
	
	public static double lineValues() {
		Scanner sc = new Scanner(System.in);
		double w, x, y, z;

		System.out.println("Enter Values For First Point");
		w = sc.nextDouble();
		y = sc.nextDouble();

		System.out.println("Enter Values For Second Point");
		x = sc.nextDouble();
		z = sc.nextDouble();

		double lineLength = (double) Math.sqrt(Math.pow((x - w), 2) + Math.pow((z - y), 2));
		return lineLength;
	}

	public static void checkEquality(double lineOneLength, double lineTwoLength) {
		if (lineOneLength == lineTwoLength) {
			System.out.println("Lines are Equal");
		} else {
			System.out.println("Lines are not Equal");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation ");

		double lineOneLength = lineValues();
		System.out.println("Length Of Line1 is: " + lineOneLength);

		double lineTwoLength = lineValues();
		System.out.println("Length Of Line2 is: " + lineTwoLength);

		checkEquality(lineOneLength, lineTwoLength);
	}
}