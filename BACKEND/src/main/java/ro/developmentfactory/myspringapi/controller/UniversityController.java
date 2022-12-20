package ro.developmentfactory.myspringapi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.developmentfactory.myspringapi.service.UniversityService;

@RestController
@RequestMapping(path = "api/v1/university")
@CrossOrigin(origins = "*")
public class UniversityController {

    private final UniversityService universityService;

    @Autowired
    public UniversityController(UniversityService universityService) {
        this.universityService = universityService;
    }
}
