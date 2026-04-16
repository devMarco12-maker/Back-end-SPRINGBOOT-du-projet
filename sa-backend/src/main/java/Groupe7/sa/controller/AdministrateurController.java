package Groupe7.sa.controller;
import Groupe7.sa.model.Administrateur;
import Groupe7.sa.service.AdministrateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/administrateurs")

public class AdministrateurController {

    @Autowired
    private AdministrateurService administrateurService;

    @GetMapping
    public List<Administrateur> getAll() {
        return administrateurService.getAllAdministrateurs();
    }

    @GetMapping("/{id}")
    public Optional<Administrateur> getById(@PathVariable int id) {
        return administrateurService.getAdministrateurById(id);
    }

    @PostMapping
    public Administrateur create(@RequestBody Administrateur administrateur) {
        return administrateurService.createAdministrateur(administrateur);
    }

    @PutMapping("/{id}")
    public Administrateur update(@PathVariable int id, @RequestBody Administrateur administrateur) {
        return administrateurService.updateAdministrateur(id, administrateur);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        administrateurService.deleteAdministrateur(id);
    }
}
