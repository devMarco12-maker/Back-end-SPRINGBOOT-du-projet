package Groupe7.sa.service;

import Groupe7.sa.model.Administrateur;
import Groupe7.sa.repository.AdministrateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdministrateurService {

    @Autowired
    private AdministrateurRepository administrateurRepository;

    public List<Administrateur> getAllAdministrateurs() {
        return administrateurRepository.findAll();
    }

    public Optional<Administrateur> getAdministrateurById(int id) {
        return administrateurRepository.findById(id);
    }

    public Administrateur createAdministrateur(Administrateur administrateur) {
        return administrateurRepository.save(administrateur);
    }

    public Administrateur updateAdministrateur(int id, Administrateur administrateur) {
        administrateur.setIdAdmin(id);
        return administrateurRepository.save(administrateur);
    }

    public void deleteAdministrateur(int id) {
        administrateurRepository.deleteById(id);
    }
}
