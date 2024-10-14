package com.example.demo.Dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProdutoDto {
    private Long idProduto;
    private String desPro;
    private Double qtdeProduto;
    private Double valProduto;

    // Getters e Setters
}
