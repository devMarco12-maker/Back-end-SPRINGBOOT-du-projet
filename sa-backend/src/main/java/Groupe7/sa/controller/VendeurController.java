package Groupe7.sa.controller;

import Groupe7.sa.model.Vendeur;
import Groupe7.sa.service.VendeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vendeurs")
public class VendeurController {

    @Autowired
    private VendeurService vendeurService;

    @GetMapping
    public List<Vendeur> getAll() {
        return vendeurService.getAllVendeurs();
    }

    @GetMapping("/{id}")
    public Optional<Vendeur> getById(@PathVariable int id) {
        return vendeurService.getVendeurById(id);
    }

    @PostMapping
    public Vendeur create(@RequestBody Vendeur vendeur) {
        return vendeurService.createVendeur(vendeur);
    }

    @PutMapping("/{id}")
    public Vendeur update(@PathVariable int id, @RequestBody Vendeur vendeur) {
        return vendeurService.updateVendeur(id, vendeur);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        vendeurService.deleteVendeur(id);
    }
}
