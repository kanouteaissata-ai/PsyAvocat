package com.psyavocat.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "utilisations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Utilisation {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String fonctionnalite;

    private Integer nombreUtilisations;

    private Integer limiteGratuite;

    private LocalDateTime derniereUtilisation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "abonnement_id")
    private Abonnement abonnement;
}
