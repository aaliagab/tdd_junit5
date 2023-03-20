package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tdd_junit5.NumerosRomanos;

class NumerosRomanosTest {

	private NumerosRomanos numerosRomanos = new NumerosRomanos();
	@Test 
	void convertir1ToRomano() {
		String romano = numerosRomanos.toRomano(1);
		
		assertEquals(romano, "I");
	}
	
	@Test 
	void convertir2ToRomano() {
		String romano = numerosRomanos.toRomano(2);
		
		assertEquals(romano, "II");
	}
	
	@Test 
	void convertir3ToRomano() {
		String romano = numerosRomanos.toRomano(3);
		
		assertEquals(romano, "III");
	}
	
	@Test 
	void convertir4ToRomano() {
		String romano = numerosRomanos.toRomano(4);
		
		assertEquals(romano, "IV");
	}
	
	@Test 
	void convertir5ToRomano() {
		String romano = numerosRomanos.toRomano(5);
		
		assertEquals(romano, "V");
	}
	
	@Test 
	void convertir14ToRomano() {
		String romano = numerosRomanos.toRomano(14);
		
		assertEquals(romano, "XIV");
	}
	
	@Test 
	void convertir57ToRomano() {
		String romano = numerosRomanos.toRomano(57);
		
		assertEquals(romano, "LVII");
	}
	
	@Test 
	void convertir1083ToRomano() {
		String romano = numerosRomanos.toRomano(1083);
		
		assertEquals(romano, "MLXXXIII");
	}

}
