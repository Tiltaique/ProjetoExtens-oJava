package com.suaempresa.frigocastro.service;

import com.suaempresa.frigocastro.model.Produto;
import com.suaempresa.frigocastro.repository.ProdutoRepository;

import java.util.List;

public class ProdutoService {

    private ProdutoRepository produtoRepository;

    public ProdutoService() {
        this.produtoRepository = new ProdutoRepository();
    }

    public void exibirProdutos() {
        List<Produto> produtos = produtoRepository.buscarTodos();
        
        for (Produto produto : produtos) {
            System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome() +
                               ", Categoria: " + produto.getCategoria() + ", Preço: R$" + produto.getPreco());
        }
    }

    // Outras operações de negócio
}