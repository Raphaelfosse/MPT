package com.MPT.monPetitTournoi.service;

import com.MPT.monPetitTournoi.model.Joueur;
import com.MPT.monPetitTournoi.repository.JoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class JoueurService {

    @Autowired
    private JoueurRepository joueurRepository;

    public Optional<Joueur> getJoueur(final UUID id) {
        return joueurRepository.findById(id);
    }

    public Iterable<Joueur> getJoueur() {
        return joueurRepository.findAll();
    }

    public void supprimerJoueur(final UUID id) {
        joueurRepository.deleteById(id);
    }

    public Joueur saveEmployee(Joueur employee) {
        return joueurRepository.save(employee);
    }


}
