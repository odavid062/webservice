package com.example.demo.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter

public class PedidoDto {
    private Long nroPedido;
    private Date datPedido;
    private List<ItensPedidoDto> itensPedido;

    // Getters e Setters
}
