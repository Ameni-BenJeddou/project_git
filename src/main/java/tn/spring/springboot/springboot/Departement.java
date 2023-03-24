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
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
public class Departement implements Serializable {
String hi;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Integer idDepart ;
     String nomDepart  ;
     @JsonIgnore
    @OneToMany(mappedBy = "departement",
    cascade = CascadeType.REMOVE)
    Set<Etudiant> etudiants ;
}

