package com.MPT.monPetitTournoi.repository;

import com.MPT.monPetitTournoi.model.Joueur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface JoueurRepository extends CrudRepository<Joueur, UUID> {
}
