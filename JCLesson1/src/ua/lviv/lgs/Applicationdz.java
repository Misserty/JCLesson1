package ua.lviv.lgs;

import java.util.Arrays;

public class Applicationdz {
	public static void main(String[] args) {

		System.out.println("Byte =" + Byte.MIN_VALUE);
		System.out.println("Byte =" + Byte.MAX_VALUE);

		System.out.println("Short =" + Short.MIN_VALUE);
		System.out.println("Short =" + Short.MAX_VALUE);

		System.out.println("Integer =" + Integer.MIN_VALUE);
		System.out.println("Integer =" + Integer.MAX_VALUE);

		System.out.println("Long =" + Long.MIN_VALUE);
		System.out.println("Long =" + Long.MAX_VALUE);

		System.out.println("Float =" + Float.MIN_VALUE);
		System.out.println("Float =" + Float.MAX_VALUE);

		System.out.println("Double =" + Double.MIN_VALUE);
		System.out.println("Double =" + Double.MAX_VALUE);

		System.out.println("Boolean =" + Boolean.FALSE);
		System.out.println("Boolean =" + Boolean.TRUE);

		System.out.println("Char =" + Character.MIN_VALUE);
		System.out.println("Char =" + Character.MAX_VALUE);

		int[] tab = { 12, 1, 21, 8, 54, 24, 26, 75 ,9 };
		int min = Arrays.stream(tab).min().getAsInt();
		int max = Arrays.stream(tab).max().getAsInt();
		System.out.println("Min = " + min);
		System.out.println("Max = " + max);
	
	//first comit to github
	}

}
