package com.psyavocat.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "forfaits")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Forfait {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String nom;

    private String description;

    private BigDecimal prix;

    private Integer duree;

    private Boolean actif;

    @OneToMany(mappedBy = "forfait")
    private List<Abonnement> abonnements = new ArrayList<>();
}
