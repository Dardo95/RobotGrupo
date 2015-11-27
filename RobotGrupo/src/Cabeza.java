import java.awt.Color;

import acm.graphics.*;
public class Cabeza extends acm.program.GraphicsProgram {
	private static final int ANCHO_PANTALLA = 541;
	private static final int ALTO_PANTALLA = 683;
	GRect cabeza;
	GImage nariz;
	GImage ojoIzquiero;
	GImage ojoDerecho;
	GImage boca;
	public void run(){

		hacerLaCabeza();

	}
	public void hacerLaCabeza(){
		cabeza=new GRect(80,104);
		cabeza.setFilled(true);
		cabeza.setFillColor(Color.pink);
		add(cabeza,ANCHO_PANTALLA/2,ALTO_PANTALLA/5);

		ojoIzquiero=new GImage("ojoizquierdo.png");
		ojoIzquiero.setSize(35,40);
		add(ojoIzquiero,ANCHO_PANTALLA/2 + 4,ALTO_PANTALLA/5 +16);
		
		ojoDerecho=new GImage("ojoDerecho.png");
		ojoDerecho.setSize(35,40);
		add(ojoDerecho,ANCHO_PANTALLA/2 + 45,ALTO_PANTALLA/5 +16);
		
		boca=new GImage("boca.png");
		boca.setSize(40,40);
		add(boca,ANCHO_PANTALLA/2 + 21 ,ALTO_PANTALLA/5 +64);
		
		nariz=new GImage("nariz.png");
		nariz.setSize(40,40);
		add(nariz,ANCHO_PANTALLA/2 +18,ALTO_PANTALLA/5 +34);
	}


}
