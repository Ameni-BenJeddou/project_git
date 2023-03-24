package tn.spring.springboot.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring.springboot.springboot.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe, Integer> {
}