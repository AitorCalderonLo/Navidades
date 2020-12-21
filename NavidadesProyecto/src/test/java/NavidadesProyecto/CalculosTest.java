package NavidadesProyecto;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculosTest {

	
	private  Calculos calculos = new Calculos();
	private int resultadoInt, resultadoEsperadoInt, x, y;
	private double resultadoDouble, resultadoEsperadoDouble;
	
	
	@Test
	public void testSuma() {
		x = 4;
		y = 7;
		
		resultadoEsperadoInt = 11;
		resultadoInt= calculos.suma(x, y);
		assertEquals(resultadoEsperadoInt, resultadoInt);
		
	}
	@Test
	public void testResta() {
		
		x = 4;
		y = 7;
		
		resultadoEsperadoInt = -3;
		resultadoInt= calculos.resta(x, y);
		assertEquals(resultadoEsperadoInt, resultadoInt);
		
	}
	@Test
	public void testDivision0Divisior() {
		
		x = 4;
		y = 7;
		
		resultadoEsperadoDouble = 0.57;
		resultadoDouble= calculos.division(x, y);
		assertEquals(resultadoEsperadoDouble, resultadoDouble, 0.002);
		
	}
	
	@Test
	public void testDivisionIgual0() {
		
		x = 4;
		y = 7;
		
		resultadoEsperadoDouble = -1;
		resultadoDouble= calculos.division(x, y);
		assertEquals(resultadoEsperadoDouble, resultadoDouble);
		
	}

}
