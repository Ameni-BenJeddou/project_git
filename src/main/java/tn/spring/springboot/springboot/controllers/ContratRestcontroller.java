package tn.spring.springboot.springboot.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.springboot.Contrat;
import tn.spring.springboot.springboot.servicesInterface.ContratServices;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping ("/contrat")
    public class ContratRestcontroller {

    ContratServices contratServices;


@GetMapping("/getALl")
    public List<Contrat> retrieveAllContrats() {
        return contratServices.retrieveAllContrats();
    }

    @PutMapping("/update")
    public Contrat updateContrat(@RequestBody Contrat ce) {
        return contratServices.updateContrat(ce);
    }
@PostMapping("/add")
    public Contrat addContrat(@RequestBody Contrat ce) {
        return contratServices.addContrat(ce);
    }

    @GetMapping("/GettByContrat/{id}")
    public Contrat retrieveContrat(@PathVariable("id") Integer idContrat) {
        return contratServices.retrieveContrat(idContrat);
    }
@DeleteMapping("/delete/{id}")
    public void removeContrat(@PathVariable("id") Integer idContrat) {
        contratServices.removeContrat(idContrat);
    }





}
