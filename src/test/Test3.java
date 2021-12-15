//Write a program which will contain two methods (multiply and division) with parameter
//and this method will return values once called and arguments are passed into it.

package test;

public class Test3 {
	
	int z;
	
	public int multiply(int x, int y) {
		return z = x*y;
	}
	
	public int division(int x, int y) {
		return z = x/y;
	}

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		System.out.println(t3.multiply(2, 3));
		System.out.println(t3.division(6, 3));
	}

}
