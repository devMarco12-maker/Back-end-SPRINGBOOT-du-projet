package Groupe7.sa.service;

import Groupe7.sa.model.Vendeur;
import Groupe7.sa.repository.VendeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class VendeurService {

    @Autowired
    private VendeurRepository vendeurRepository;

    public List<Vendeur> getAllVendeurs() {
        return vendeurRepository.findAll();
    }

    public Optional<Vendeur> getVendeurById(int id) {
        return vendeurRepository.findById(id);
    }

    public Vendeur createVendeur(Vendeur vendeur) {
        return vendeurRepository.save(vendeur);
    }

    public Vendeur updateVendeur(int id, Vendeur vendeur) {
        vendeur.setId(id);
        return vendeurRepository.save(vendeur);
    }

    public void deleteVendeur(int id) {
        vendeurRepository.deleteById(id);
    }
}

