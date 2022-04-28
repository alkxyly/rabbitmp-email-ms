package com.microservices.entity.pedido.gateway;

import com.microservices.entity.pedido.model.Pedido;

public interface PedidoGateway {

	void criar(Pedido pedido);
}
