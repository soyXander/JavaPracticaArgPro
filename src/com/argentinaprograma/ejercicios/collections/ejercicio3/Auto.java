package com.argentinaprograma.ejercicios.collections.ejercicio3;

public class Auto {
	private String num_patente;
	private String marca;
	private String modelo;
	private String color;
	private String chasis;

	public Auto(String num_patente, String marca, String modelo, String color, String chasis) {
		this.num_patente = num_patente;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.chasis = chasis;
	}

	public String getNum_patente() {
		return num_patente;
	}

	public void setNum_patente(String num_patente) {
		this.num_patente = num_patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getChasis() {
		return chasis;
	}
}
