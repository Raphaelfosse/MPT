package com.MPT.monPetitTournoi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "tournoi")
public class Tournoi {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "jeu")
    private String jeu;

    @Column(name = "heureDebut")
    private String heureDebut;

    @Column(name = "dateDebut")
    private String dateDebut;

    @Column(name = "joueur")
    @OneToMany
    private List<Joueur> joueurs;

}
