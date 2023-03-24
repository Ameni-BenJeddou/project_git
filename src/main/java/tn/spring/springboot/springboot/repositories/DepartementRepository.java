package tn.spring.springboot.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring.springboot.springboot.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Integer> {
}