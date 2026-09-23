package com.psyavocat.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "categories_besoin")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategorieBesoin {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String nom;

    private String description;

    private String typeProfessionnel;

    private Boolean actif;
}
