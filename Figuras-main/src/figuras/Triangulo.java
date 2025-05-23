package figuras;

import java.awt.Color;

public class Triangulo extends Figura{
	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo(double x, double y, Color color, double lado1, double lado2, double lado3){
	super (x, y, color);
	this.setLado1(lado1);
	this.setLado2(lado2);
	this.setLado3(lado3);
	}

	
	public double perimetro (){
	   return getLado1() + getLado2() + getLado3();
	}
	
	public double area (){ 
	   double sp = perimetro() / 2;
	   return Math.sqrt(sp * (sp - getLado1()) * (sp - getLado2()) * (sp - getLado3())); 
	}


	public double getLado3() {
		return lado3;
	}


	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}


	public double getLado2() {
		return lado2;
	}


	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}


	public double getLado1() {
		return lado1;
	}


	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
}
