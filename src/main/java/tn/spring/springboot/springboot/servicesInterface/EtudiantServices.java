package tn.spring.springboot.springboot.servicesInterface;

import tn.spring.springboot.springboot.Etudiant;
import java.util.List;
public interface EtudiantServices {
    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant(Etudiant e);

    Etudiant updateEtudiant(Etudiant e);

    Etudiant retrieveEtudiant(Integer idEtudiant);

    void removeEtudiant(Integer idEtudiant);
}
