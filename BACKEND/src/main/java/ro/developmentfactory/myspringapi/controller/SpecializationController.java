package ro.developmentfactory.myspringapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.developmentfactory.myspringapi.service.SpecializationService;


@RestController
@RequestMapping(path = "api/v1/specialization")
@CrossOrigin(origins = "*")
public class SpecializationController {

    private final SpecializationService specializationService;

    @Autowired
    public SpecializationController(SpecializationService specializationService) {
        this.specializationService = specializationService;
    }
}
