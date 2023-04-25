package com.MPT.monPetitTournoi.repository;

import com.MPT.monPetitTournoi.model.Tournoi;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TournoiRepository extends CrudRepository<Tournoi, UUID> {
}
