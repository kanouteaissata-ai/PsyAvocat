package com.psyavocat.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "soumissions_dossier")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SoumissionDossier {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private LocalDateTime dateSoumission;

    private String statut;

    @Column(columnDefinition = "TEXT")
    private String reponse;

    private BigDecimal tarifPropose;

    private LocalDateTime dateReponse;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dossier_id")
    private Dossier dossier;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "avocat_id")
    private Avocat avocat;
}
