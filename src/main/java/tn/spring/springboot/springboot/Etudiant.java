package tn.spring.springboot.springboot;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Set;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level =AccessLevel.PRIVATE)
@Entity
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer idEtudiant; // Clé primaire
    String prenomE;
    String nomE;
    @Enumerated(EnumType.STRING)
    Opt opt;
    @JsonIgnore
    @OneToMany(mappedBy = "etudiant")
    Set<Contrat> contrats ;
    @ManyToOne(cascade =CascadeType.PERSIST)
    Departement departement ;
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JsonIgnore
    Set<Equipe> equipes ;


}
