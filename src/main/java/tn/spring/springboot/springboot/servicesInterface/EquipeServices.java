package tn.spring.springboot.springboot.servicesInterface;
import tn.spring.springboot.springboot.Equipe;

import java.util.List;
public interface EquipeServices {
    List<Equipe> retrieveAllEquipes();

    Equipe addEquipe(Equipe e); // ajouter l’équipe avec son détail

    Equipe updateEquipe (Equipe e);

    Equipe retrieveEquipe (Integer idEquipe);
}
