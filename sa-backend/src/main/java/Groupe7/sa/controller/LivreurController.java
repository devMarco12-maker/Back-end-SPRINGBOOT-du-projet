package Groupe7.sa.controller;
import Groupe7.sa.model.Livreur;
import Groupe7.sa.service.LivreurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livreurs")
public class LivreurController {

    @Autowired
    private LivreurService livreurService;

    @GetMapping
    public List<Livreur> getAll() {
        return livreurService.getAllLivreurs();
    }

    @GetMapping("/{id}")
    public Optional<Livreur> getById(@PathVariable int id) {
        return livreurService.getLivreurById(id);
    }

    @PostMapping
    public Livreur create(@RequestBody Livreur livreur) {
        return livreurService.createLivreur(livreur);
    }

    @PutMapping("/{id}")
    public Livreur update(@PathVariable int id, @RequestBody Livreur livreur) {
        return livreurService.updateLivreur(id, livreur);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        livreurService.deleteLivreur(id);
    }
}
