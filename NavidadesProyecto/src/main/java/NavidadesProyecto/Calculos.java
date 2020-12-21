package NavidadesProyecto;

public class Calculos {
	
	private int p;
	private int b;
	private int a;
	private int c;
	private int m;
	
	public int suma(int x, int y) {
		return x + y;
	}

	public int resta(int x, int y) {
		return x - y;
	}

	public double division(double x, double y) {
		if (y == 0) {
			return -1;
		} else {
			return x / y;
		}

	}
}
