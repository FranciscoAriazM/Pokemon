package com.test2.modelo;

public class Pokemon {
	private int numero;
	private String nombre;
	private String tipo;

	public Pokemon() {

	}

	public Pokemon(int numero, String nombre, String tipo) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
