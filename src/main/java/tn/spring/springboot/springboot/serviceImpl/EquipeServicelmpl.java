package tn.spring.springboot.springboot.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.springboot.Equipe;
import tn.spring.springboot.springboot.repositories.EquipeRepository;
import tn.spring.springboot.springboot.servicesInterface.EquipeServices;

import java.util.List;

@Service
public class EquipeServicelmpl implements EquipeServices{

    @Autowired
    EquipeRepository EquipeRepo ;


    @Override
    public List<Equipe> retrieveAllEquipes() {
        return EquipeRepo.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe e) {
        return EquipeRepo.save(e);
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return EquipeRepo.save(e);
    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return EquipeRepo.findById(idEquipe).orElse(null);
    }
}
