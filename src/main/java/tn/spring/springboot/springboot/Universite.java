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
@FieldDefaults(level =AccessLevel.PRIVATE)

@Entity
public class Universite implements  Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

     Integer idUniv ;
     String nomUnive ;
     @OneToMany (cascade ={CascadeType.PERSIST,
     CascadeType.REMOVE})
    Set<Departement> departements ;

}
