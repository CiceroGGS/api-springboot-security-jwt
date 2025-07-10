package com.cicerodev.pratica_springboot.controller;

import com.cicerodev.pratica_springboot.model.ProdutoModel;
import com.cicerodev.pratica_springboot.service.ProdutoService;
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
    public ResponseEntity<ProdutoModel> listarProdutos(@PathVariable Long id) {
        return produtoService.bucarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
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
