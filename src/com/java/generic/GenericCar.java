package com.java.generic;

public class GenericCar<T>{
	T model;
	T type;
	T wheel;
	T seat;
	public GenericCar(T model, T type, T wheel, T seat) {
		super();
		this.model = model;
		this.type = type;
		this.wheel = wheel;
		this.seat = seat;
	}
	public T getModel() {
		return model;
	}
	public void setModel(T model) {
		this.model = model;
	}
	public T getType() {
		return type;
	}
	public void setType(T type) {
		this.type = type;
	}
	public T getWheel() {
		return wheel;
	}
	public void setWheel(T wheel) {
		this.wheel = wheel;
	}
	public T getSeat() {
		return seat;
	}
	public void setSeat(T seat) {
		this.seat = seat;
	}
	@Override
	public String toString() {
		return "GenericCar [model=" + model + ", type=" + type + ", wheel=" + wheel + ", seat=" + seat + "]";
	}
	
	
	

}
