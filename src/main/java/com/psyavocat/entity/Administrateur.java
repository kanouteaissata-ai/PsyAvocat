package com.psyavocat.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "administrateurs")
@Getter
@Setter
@NoArgsConstructor
public class Administrateur extends Utilisateur {
}
