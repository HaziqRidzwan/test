//Write a program which will contain one method with a parameter (data type string) and this method
//will return the result once called and argument is passed into it.

package test;

public class Test4 {
	
	public String name(String name) {
		return name;
	}

	public static void main(String[] args) {
		
		Test4 t4 = new Test4();
		System.out.println("My name is " + t4.name("Haziq"));

	}

}
