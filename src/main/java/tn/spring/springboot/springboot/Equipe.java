package tn.spring.springboot.springboot;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.* ;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults( level = AccessLevel.PRIVATE)
@Entity
public class Equipe implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idEquipe ;
    String nomEquipe ;
    Niveau niveau ;
    @ManyToMany( mappedBy = "equipes",
    cascade =CascadeType.REMOVE)
    Set<Etudiant> etudiants;
    @OneToOne(mappedBy="equipe",
    cascade =CascadeType.REMOVE)
    DetailEquipe detailEquipe ;
}

