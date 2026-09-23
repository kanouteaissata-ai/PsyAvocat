package com.psyavocat.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "psychologues")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Psychologue extends Professionnel {

    private String numeroAgrement;

    @OneToMany(mappedBy = "psychologue")
    private List<FichePatient> fichesPatient = new ArrayList<>();

    @OneToMany(mappedBy = "psychologue")
    private List<Seance> seances = new ArrayList<>();
}
