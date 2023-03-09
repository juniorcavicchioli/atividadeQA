package calculadora;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestClass {

	Calculadora calc = new Calculadora();
	@Test
	public void testSoma() {
		int valor1 = 2;
		int valor2 = 1;
		int resultado = calc.dividir(valor1,valor2);
		assertEquals(2, resultado);
		
	}
	@Test
	public void testDividir() {
		int valor1 = 2;
		int valor2 = 1;
		int resultado = calc.dividir(valor1,valor2);
		assertEquals(2, resultado);
	}
	@Test
	public void testSubtrair() {
		int valor1 = 2;
		int valor2 = 1;
		int resultado = calc.subtrair(valor1,valor2);
		assertEquals(1, resultado);
	}
	@Test
	public void testMultiplicar() {
		int valor1 = 2;
		int valor2 = 1;
		int resultado = calc.multiplicar(valor1,valor2);
		assertEquals(2, resultado);
	}

}
