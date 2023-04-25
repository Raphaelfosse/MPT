package com.MPT.monPetitTournoi.sql;

import com.MPT.monPetitTournoi.model.Tournoi;
import com.MPT.monPetitTournoi.repository.TournoiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    private final TournoiRepository tournoiRepository;

    public DatabaseLoader(TournoiRepository tournoiRepository) {
        this.tournoiRepository = tournoiRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.tournoiRepository.save(new Tournoi());
    }
}
