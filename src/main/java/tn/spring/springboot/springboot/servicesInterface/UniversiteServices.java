package tn.spring.springboot.springboot.servicesInterface;
import tn.spring.springboot.springboot.Universite;

import java.util.List;
public interface UniversiteServices {
    List<Universite> retrieveAllUniversites();
    Universite addUniversite (Universite u);
    Universite updateUniversite (Universite u);
    Universite retrieveUniversite (Integer idUniversite);
}

