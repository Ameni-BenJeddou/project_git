package tn.spring.springboot.springboot.servicesInterface;
import tn.spring.springboot.springboot.Departement;

import java.util.List;


public interface DeprtementServices {
    List<Departement> retrieveAllDepartements();

    Departement addDepartement (Departement d);

    Departement updateDepartement (Departement d);

    Departement retrieveDepartement (Integer idDepart);
}
