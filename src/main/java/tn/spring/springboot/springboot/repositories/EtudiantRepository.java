package tn.spring.springboot.springboot.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring.springboot.springboot.Etudiant;
import java.util.List;
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {

  //  List<Etudiant> findByDepartmentIdDepartmentAndEquipesNiveauLike(Integer id,String SENIOR) ;

}