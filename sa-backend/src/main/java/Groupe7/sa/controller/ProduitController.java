package Groupe7.sa.controller;

import Groupe7.sa.model.Produit;
import Groupe7.sa.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produits")


public class ProduitController {

    @Autowired
    private ProduitService produitService;

    @GetMapping
    public List<Produit> getAll() {
        return produitService.getAllProduits();
    }

    @GetMapping("/{id}")
    public Optional<Produit> getById(@PathVariable int id) {
        return produitService.getProduitById(id);
    }

    @PostMapping
    public Produit create(@RequestBody Produit produit) {
        return produitService.createProduit(produit);
    }

    @PutMapping("/{id}")
    public Produit update(@PathVariable int id, @RequestBody Produit produit) {
        return produitService.updateProduit(id, produit);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        produitService.deleteProduit(id);
    }
}