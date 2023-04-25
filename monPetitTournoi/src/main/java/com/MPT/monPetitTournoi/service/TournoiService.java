package com.MPT.monPetitTournoi.service;

import com.MPT.monPetitTournoi.model.Tournoi;
import com.MPT.monPetitTournoi.repository.TournoiRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.UUID;

public class TournoiService {

    @Autowired
    private TournoiRepository tournoiRepository;

    public Optional<Tournoi> getTournoi(final UUID id) {
        return tournoiRepository.findById(id);
    }

    public Iterable<Tournoi> getJoueur() {
        return tournoiRepository.findAll();
    }

    public void supprimerTournoi(final UUID id) {
        tournoiRepository.deleteById(id);
    }

    public Tournoi enregistrerTournoi(Tournoi tournoi) {
        return tournoiRepository.save(tournoi);
    }
}
