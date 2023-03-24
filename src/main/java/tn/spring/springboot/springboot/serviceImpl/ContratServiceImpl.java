package tn.spring.springboot.springboot.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.springboot.Contrat;
import tn.spring.springboot.springboot.repositories.ContratRepository;
import tn.spring.springboot.springboot.servicesInterface.ContratServices;

import java.util.List;

@Service
public class ContratServiceImpl implements ContratServices {
    @Autowired
    ContratRepository contratRepo ;

    @Override
    public List<Contrat> retrieveAllContrats() {
        return contratRepo.findAll();
    }

    @Override
    public Contrat updateContrat(Contrat ce) {
        return contratRepo.save(ce);
    }

    @Override
    public Contrat addContrat(Contrat ce) {
        return contratRepo.save(ce);
    }

    @Override
    public Contrat retrieveContrat(Integer idContrat) {
        return contratRepo.findById(idContrat).orElse(null);
    }

    @Override
    public void removeContrat(Integer idContrat) {
        contratRepo.deleteById(idContrat);

    }
}
