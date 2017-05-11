package com.navent.fastete.dominio;

import java.math.BigDecimal;

public class Pedido {

	private int idPedido; 
	private String nombre; 
	private BigDecimal monto; 
	private BigDecimal descuento;
	
	public Pedido(){
		super();
	}
	
	public Pedido(int idPedido, String nombre, BigDecimal monto,
			BigDecimal descuento) {
		super();
		this.idPedido = idPedido;
		this.nombre = nombre;
		this.monto = monto;
		this.descuento = descuento;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public BigDecimal getDescuento() {
		return descuento;
	}
	public void setDescuento(BigDecimal descuento) {
		this.descuento = descuento;
	}
	
	
}
