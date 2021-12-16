//Write a program which will print even and odd number from 0 to 10.


package test;

public class Test1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("Even Number " + i);
			} else {
				System.out.println("Odd Number " + i);
			}
		}

	}

}
