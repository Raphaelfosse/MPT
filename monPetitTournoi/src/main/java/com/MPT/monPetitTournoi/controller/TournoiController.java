package com.MPT.monPetitTournoi.controller;

import com.MPT.monPetitTournoi.model.Tournoi;
import com.MPT.monPetitTournoi.repository.TournoiRepository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/tournoi")
public class TournoiController {

    private TournoiRepository tournoiRepository;

    @ModelAttribute("tournoi")
    @RequestMapping(value = "/")
    public Optional<Tournoi> recupererTournois(UUID uuid) {
        return tournoiRepository.findById(uuid);
    }
}

