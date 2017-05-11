package com.navent.fastete.services;

import java.math.BigDecimal;

import com.navent.fastete.cache.BumexMemcached;
import com.navent.fastete.dao.PedidosDAO;
import com.navent.fastete.dominio.Pedido;

public class PedidoService {

	/* Se asume que es un cache de pedidos por eso se guarda por id de pedido
	 *  si fuera mas general habría que buscar otro id como por ej hashcode*/
	private BumexMemcached cache = BumexMemcached.getInstance();

	public Pedido crear(int idPedido, String nombre, BigDecimal monto, BigDecimal descuento) {
		Pedido pedido = new Pedido(idPedido, nombre, monto, descuento);
		// Guardar en cache y DB
		PedidosDAO.insertOrUpdate(pedido);	
		this.cache.set(String.valueOf(pedido.getIdPedido()), pedido);
		return pedido;
	}
	
	public Pedido edit(Pedido pedido) {
		
		cache.set(String.valueOf(pedido.getIdPedido()), pedido);
		PedidosDAO.insertOrUpdate(pedido);
		return pedido;
	}
	
	public Pedido findById(Integer id) {
		Pedido pedidoEnCache = (Pedido) this.cache.get(String.valueOf(id));
		if (pedidoEnCache != null) {
			return pedidoEnCache;
		}
		return PedidosDAO.select(id);
	}
	
	public void delete(Pedido pedido) {
		
		if (this.cache.get(String.valueOf(pedido.getIdPedido())) != null) {
			this.cache.delete(String.valueOf(pedido.getIdPedido()));
		}
		PedidosDAO.delete(pedido);
	}
	
	
}
