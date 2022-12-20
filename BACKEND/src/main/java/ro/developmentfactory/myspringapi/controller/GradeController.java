package ro.developmentfactory.myspringapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.developmentfactory.myspringapi.service.GradeService;


@RestController
@RequestMapping(path = "api/v1/grade")
@CrossOrigin(origins = "*")
public class GradeController {
    private final GradeService gradeService;

    @Autowired
    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }
}
