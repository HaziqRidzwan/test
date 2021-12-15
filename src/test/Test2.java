//Given: Array car containing 5 elements Toyota, Kia, Ford, Tesla, Truck
//Exit out the loop once car equal to Tesla

package test;

public class Test2 {

	public static void main(String[] args) {
		String car[] = {"Toyota", "Kia", "Ford", "Tesla", "Truck"};
		for (int i = 0; i < car.length; i++) {
			if (car[i] == "Tesla") {
				System.out.println("Tesla is here.");
				break;
			} 
		System.out.println("Not Tesla. Loop number searched " + i);
		}

	}

}
