package Groupe7.sa.controller;

import Groupe7.sa.model.Commande;
import Groupe7.sa.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/commandes")
public class CommandeController {

    @Autowired
    private CommandeService commandeService;

    @GetMapping
    public List<Commande> getAll() {
        return commandeService.getAllCommandes();
    }

    @GetMapping("/{id}")
    public Optional<Commande> getById(@PathVariable int id) {
        return commandeService.getCommandeById(id);
    }

    @PostMapping
    public Commande create(@RequestBody Commande commande) {
        return commandeService.createCommande(commande);
    }

    @PutMapping("/{id}")
    public Commande update(@PathVariable int id, @RequestBody Commande commande) {
        return commandeService.updateCommande(id, commande);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        commandeService.deleteCommande(id);
    }
}
