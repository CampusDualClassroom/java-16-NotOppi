package com.campusdual.classroom;

public class Plane implements IMachine {

	private final String name;

	public Plane(String name) {
		this.name = name;
	}

	@Override
	public void maintenance() {
		System.out.println("El avión se ha puesto en mantenimiento");
	}

	@Override
	public void stop() {
		System.out.println("El avión se ha apagado");
	}

	@Override
	public void start() {
		System.out.println("El avión se ha encendido");
	}

	public void takeOff() {
		System.out.println("El avión despega");
	}

	public void land() {
		System.out.println("El avión aterriza");
	}

	public void fly() {
		System.out.println("El avión está volando");
	}
}
