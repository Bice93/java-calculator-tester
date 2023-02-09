package org.lessons.java.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private Calculator c = new Calculator();

	@Test
	@DisplayName ("Verifica addizione")
	void testAdd() throws Exception {
		float valore = c.add(5, 2);
		assertEquals(7, valore, "La somma deve essere 7.");
		
		valore += c.add(2, 1);
		assertEquals(10, valore, "La somma deve essere 10.");
	}
	
	@Test
	@DisplayName ("Verifica addizione non corretta")
	void testAddFailed() {
		assertThrows(Exception.class, () -> c.add(-2, 3), "deve generare un'eccezione!" );
	}
	
	@Test
	@DisplayName ("Verifica sottrazione")
	void testSubtract() throws Exception {
		float valore = c.subtract(5, 2);
		assertEquals(3, valore, "La sottrazione deve essere 3.");
	}
	
	@Test
	@DisplayName ("Verifica sottrazione non corretta")
	void testSubtractFailed() {
		assertThrows(Exception.class, () -> c.subtract(-7, 4), "deve generare un'eccezione!" );
	}
	
	@Test
	@DisplayName ("Verifica divisione")
	void testDivide() throws Exception {
		float valore = c.divide(10, 5);
		assertEquals(2, valore, "La divisione deve essere 2.");
	}
	
	@Test
	@DisplayName ("Verifica divisione non corretta")
	void testDivideFailed() throws Exception {
		assertThrows(Exception.class, () -> c.divide(10, 0), "deve generare un'eccezione!" );
		
		assertThrows(Exception.class, () -> c.multiply(-6, 3), "deve generare un'eccezione, numero negativo!" );
	}
	
	@Test
	@DisplayName ("Verifica moltiplicazione")
	void testMultiply() throws Exception {
		float valore = c.multiply(2, 2);
		assertEquals(4, valore, "La moltiplicazione deve essere 4.");
	}
	
	@Test
	@DisplayName ("Verifica moltiplicazione non corretta")
	void testMultiplyFailed() {
		assertThrows(Exception.class, () -> c.multiply(-3, 2), "deve generare un'eccezione!" );
	}
	


}
