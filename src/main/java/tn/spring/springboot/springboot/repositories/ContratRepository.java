package tn.spring.springboot.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.springboot.Contrat;
@Repository
public interface ContratRepository extends JpaRepository<Contrat, Integer> {
}