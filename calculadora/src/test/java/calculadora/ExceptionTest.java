package calculadora;

import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

public class ExceptionTest {

	
	@Test
	public void testExeptionMessage() {
		try {
			new ArrayList<Object>().get(0);
			fail("Esperado que IndexOutOfBoundsException seja lançada");
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Exception gerada.");
		}
	}
	
}
