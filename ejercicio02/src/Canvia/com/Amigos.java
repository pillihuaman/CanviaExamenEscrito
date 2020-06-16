package Canvia.com;

import java.awt.font.NumericShaper;
import java.util.List;

public class Amigos {

	public int getDistancia() {
		return distancia;
	}
	public int getTiempo() {
		return tiempo;
	}
	public int getPuntoFinalLibro() {
		return puntoFinalLibro;
	}
	public String getNombre() {
		return nombre;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	public void setPuntoFinalLibro(int puntoFinalLibro) {
		this.puntoFinalLibro = puntoFinalLibro;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private  int distancia;
	private  int tiempo;
	private  int puntoFinalLibro;
	private String nombre;
	
}
