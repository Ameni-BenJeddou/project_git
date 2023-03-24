package tn.spring.springboot.springboot.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.springboot.Contrat;
import tn.spring.springboot.springboot.Departement;
import tn.spring.springboot.springboot.repositories.ContratRepository;
import tn.spring.springboot.springboot.repositories.DepartementRepository;
import tn.spring.springboot.springboot.servicesInterface.ContratServices;
import org.springframework.beans.factory.annotation.Autowired;
import tn.spring.springboot.springboot.servicesInterface.DeprtementServices;

import java.util.List;
@Service
public class DepartementServicelmpl implements DeprtementServices {
    @Autowired
    DepartementRepository DepartementRepo ;

    @Override
    public List<Departement> retrieveAllDepartements() {
        return DepartementRepo.findAll();
    }

    @Override
    public Departement addDepartement(Departement d) {
        return DepartementRepo.save(d); }

    @Override
    public Departement updateDepartement(Departement d) {
        return DepartementRepo.save(d);
    }

    @Override
    public Departement retrieveDepartement(Integer idDepart) {
        return DepartementRepo.findById(idDepart).orElse(null);
    }
}
