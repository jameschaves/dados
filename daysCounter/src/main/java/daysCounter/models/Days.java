package daysCounter.models;

import java.util.Date;
import java.util.List;

public class Days {

	public Days(String data, int acumulado) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Days [data =" + data + ", acumulado=" + acumulado + "]";
	}
	public int getAcumulado() {
		return acumulado;
	}
	public void setAcumulado(int acumulado) {
		this.acumulado = acumulado;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	private int acumulado;
	private String data;
}
