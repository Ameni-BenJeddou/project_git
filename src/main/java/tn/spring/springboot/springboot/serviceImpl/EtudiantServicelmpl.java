package tn.spring.springboot.springboot.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.springboot.Etudiant;
import tn.spring.springboot.springboot.repositories.EtudiantRepository;
import tn.spring.springboot.springboot.servicesInterface.EtudiantServices;

import java.util.List;

@Service
public class EtudiantServicelmpl implements EtudiantServices {
    @Autowired
    EtudiantRepository EtudiantRepo ;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return EtudiantRepo.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return EtudiantRepo.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return EtudiantRepo.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        return EtudiantRepo.findById(idEtudiant).orElse(null);
    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {
        EtudiantRepo.deleteById(idEtudiant);

    }
}
