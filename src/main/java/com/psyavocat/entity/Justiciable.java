package com.psyavocat.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "justiciables")
@Getter
@Setter
@NoArgsConstructor
public class Justiciable extends Utilisateur {

    @OneToMany(mappedBy = "justiciable", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Dossier> dossiers = new ArrayList<>();
}
