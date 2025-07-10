package com.cicerodev.pratica_springboot.controller;

import com.cicerodev.pratica_springboot.exceptions.RecursoNaoEncontradoException;
import com.cicerodev.pratica_springboot.model.ProdutoModel;
import com.cicerodev.pratica_springboot.service.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    /*====================================================*/
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }
    /*====================================================*/

    @GetMapping
    public List<ProdutoModel> listarProdutos() {
        return produtoService.listarProdutos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> listarProdutos(@PathVariable Long id) {
        ProdutoModel produto = produtoService.bucarPorId(id);
        return ResponseEntity.ok(produto);
    }

    @PostMapping
    public ProdutoModel criarProduto(@RequestBody ProdutoModel produtoModel) {
        return produtoService.salvarProduto(produtoModel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleterProduto(@PathVariable Long id) {
        produtoService.deletarProduto(id);
        return ResponseEntity.noContent().build();
    }
    /*====================================================*/

}
