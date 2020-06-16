package Canvia.com;

import java.util.List;

public class Empleados {
	private String caracter;
	private Integer cantidad;
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	private int  sueldo;
	private int indice;
	public int getIndice() {
		return indice;
	}
	public void setIndice(int indice) {
		this.indice = indice;
	}

	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public String getCaracter() {
		return caracter;
	}
	public List<String> getListCaracter() {
		return listCaracter;
	}
	public void setCaracter(String caracter) {
		this.caracter = caracter;
	}
	public void setListCaracter(List<String> listCaracter) {
		this.listCaracter = listCaracter;
	}
	private List<String> listCaracter;
	
}
