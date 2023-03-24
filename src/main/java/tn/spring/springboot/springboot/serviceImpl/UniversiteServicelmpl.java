package tn.spring.springboot.springboot.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.springboot.Universite;
import tn.spring.springboot.springboot.repositories.UniversiteRepository;
import tn.spring.springboot.springboot.servicesInterface.UniversiteServices;

import java.util.List;

@Service
public class UniversiteServicelmpl implements UniversiteServices {
    @Autowired
    UniversiteRepository UniversiteRepo;


    @Override
    public List<Universite> retrieveAllUniversites() {
        return UniversiteRepo.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return UniversiteRepo.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return UniversiteRepo.save(u);
    }

    @Override
    public Universite retrieveUniversite(Integer idUniversite) {
        return UniversiteRepo.findById(idUniversite).orElse(null);
    }
}
