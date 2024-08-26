package com.suaempresa.frigocastro;

import com.suaempresa.frigocastro.service.ProdutoService;

public class Main {
    public static void main(String[] args) {
        ProdutoService produtoService = new ProdutoService();
        
        // Exemplo de uso do serviço
        produtoService.exibirProdutos();
    }
}