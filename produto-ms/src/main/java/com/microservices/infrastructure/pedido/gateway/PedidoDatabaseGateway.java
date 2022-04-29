package com.microservices.infrastructure.pedido.gateway;

import org.springframework.stereotype.Component;

import com.microservices.entity.pedido.gateway.PedidoGateway;
import com.microservices.entity.pedido.model.Pedido;

@Component
public class PedidoDatabaseGateway implements PedidoGateway{

	@Override
	public void criar(Pedido pedido) {
		
	}

}
