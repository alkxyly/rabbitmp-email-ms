package com.microservices.usecase.pedido;

import org.springframework.stereotype.Service;

import com.microservices.entity.pedido.gateway.PedidoGateway;

@Service
public class CriarPedidoUseCase {
	
	private PedidoGateway pedidoGateway;
}
