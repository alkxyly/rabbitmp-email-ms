package com.microservices.usecase.pedido;

import org.springframework.stereotype.Service;

import com.microservices.entity.pedido.gateway.PedidoGateway;
import com.microservices.entity.pedido.model.Pedido;

@Service
public class CriarPedidoUseCase {
	
	private PedidoGateway pedidoGateway;
	
	public CriarPedidoUseCase(PedidoGateway pedidoGateway) {
		this.pedidoGateway = pedidoGateway;		
	}
	
	public void execute(Input input) {
		pedidoGateway.criar(new Pedido());
	}
	
	public class Input {
		
	}
}
