package tn.spring.springboot.springboot.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.springboot.Departement;
import tn.spring.springboot.springboot.serviceImpl.DepartementServicelmpl;
import tn.spring.springboot.springboot.servicesInterface.DeprtementServices;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Departement")

public class DepartementRestcontroller {
    DeprtementServices departementService;
    @GetMapping("/getALl")
    public List<Departement> retrieveAllDepartements() {return departementService.retrieveAllDepartements();}

        @PutMapping("/update")
        public  Departement updateDepartement (@RequestBody Departement de) {
            return departementService.updateDepartement(de);
        }



    }



    }
