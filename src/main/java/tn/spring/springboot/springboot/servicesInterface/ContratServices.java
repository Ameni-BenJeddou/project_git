package tn.spring.springboot.springboot.servicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import tn.spring.springboot.springboot.Contrat;
import tn.spring.springboot.springboot.repositories.ContratRepository;

import java.util.List;

public interface ContratServices {

    List<Contrat> retrieveAllContrats();

    Contrat updateContrat (Contrat ce);

    Contrat addContrat (Contrat ce);

    Contrat retrieveContrat (Integer idContrat);

    void removeContrat(Integer idContrat);
}
