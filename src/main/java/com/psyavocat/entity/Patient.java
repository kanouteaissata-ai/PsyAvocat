package com.psyavocat.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "patients")
@Getter
@Setter
@NoArgsConstructor
public class Patient extends Utilisateur {

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FichePatient> fichesPatient = new ArrayList<>();

    @OneToMany(mappedBy = "patient")
    private List<RendezVous> rendezVous = new ArrayList<>();

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ResultatOrientation> resultatsOrientation = new ArrayList<>();
}
