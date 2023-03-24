package tn.spring.springboot.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring.springboot.springboot.Universite;

public interface UniversiteRepository extends JpaRepository<Universite, Integer> {
}