package org.lessons.java.calculator;

public class Calculator {

	
	public float add (float num1, float num2) {
		return num1 + num2;
	};
	
	public float subtract (float num1, float num2) {
		return num1 - num2;
	};
	
	public float divide (float num1, float num2) throws Exception {
		if ( num2 == 0 ) {
			throw new Exception("Impossibile dividere per 0.");
		}
		return num1 / num2;
	};
	
	public float multiply (float num1, float num2) {
		return num1 * num2;
	};
	
//	public static void main(String[] args) throws Exception {
//		Calculator c = new Calculator();
//		
//		try {
//			System.out.println(c.divide(10, 5));
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println(c.add(2, 5));
//		System.out.println(c.subtract(5, 2));
//		System.out.println(c.multiply(2, 2));
//	}
}
