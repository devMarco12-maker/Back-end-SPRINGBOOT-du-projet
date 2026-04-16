package Groupe7.sa.service;
import Groupe7.sa.model.Livreur;
import Groupe7.sa.repository.LivreurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class LivreurService {

    @Autowired
    private LivreurRepository livreurRepository;

    public List<Livreur> getAllLivreurs() {
        return livreurRepository.findAll();
    }

    public Optional<Livreur> getLivreurById(int id) {
        return livreurRepository.findById(id);
    }

    public Livreur createLivreur(Livreur livreur) {
        return livreurRepository.save(livreur);
    }

    public Livreur updateLivreur(int id, Livreur livreur) {
        livreur.setId(id);
        return livreurRepository.save(livreur);
    }

    public void deleteLivreur(int id) {
        livreurRepository.deleteById(id);
    }
}
