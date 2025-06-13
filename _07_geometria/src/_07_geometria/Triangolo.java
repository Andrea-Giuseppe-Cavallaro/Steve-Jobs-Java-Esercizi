package _07_geometria;

public class Triangolo extends Forma{
	private double latoA;
	private double latoB;
	private double latoC;
	private double base;
	private double altezza;
	
	public Triangolo(double latoA, double latoB, double latoC, double base, double altezza) {
		this.latoA = latoA;
		this.latoB = latoB;
		this.latoC = latoC;
		this.base = base;
		this.altezza = altezza;
	}
	
	public double getLatoA() {
		return latoA;
	}
	public void setLatoA(double latoA) {
		this.latoA = latoA;
	}
	public double getLatoB() {
		return latoB;
	}
	public void setLatoB(double latoB) {
		this.latoB = latoB;
	}
	public double getLatoC() {
		return latoC;
	}
	public void setLatoC(double latoC) {
		this.latoC = latoC;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltezza() {
		return altezza;
	}
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	@Override
	public double calcolaArea() {
		double area;
		area = (base * altezza)/2;
		return area;
	}
	
	@Override
	public double calcolaPerimetro() {
		double perimetro;
		perimetro = latoA + latoB + latoC;
		return perimetro;
	}

	@Override
	public String toString() {
		return "Triangolo [latoA=" + latoA + ", latoB=" + latoB + ", latoC=" + latoC + ", base=" + base + ", altezza="
				+ altezza + "]";
	}
	
	
	
}
