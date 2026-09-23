package com.psyavocat.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "reponses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reponse {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String libelle;

    private String valeur;

    private Integer poids;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Question question;
}
