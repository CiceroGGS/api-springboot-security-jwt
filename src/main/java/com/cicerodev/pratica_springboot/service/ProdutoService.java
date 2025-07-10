package com.cicerodev.pratica_springboot.service;

import com.cicerodev.pratica_springboot.model.ProdutoModel;
import com.cicerodev.pratica_springboot.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    /*====================================================*/
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }
    /*====================================================*/

    public List<ProdutoModel> listarProdutos() {
        return produtoRepository.findAll();
    }
    /*====================================================*/

    public Optional<ProdutoModel> bucarPorId(Long id) {
        return produtoRepository.findById(id);
    }
    /*====================================================*/

    public ProdutoModel salvarProduto(ProdutoModel produto) {
        return produtoRepository.save(produto);
    }
    /*====================================================*/

    public void deletarProduto(Long id) {
        produtoRepository.deleteById(id);
    }
    /*====================================================*/
}
