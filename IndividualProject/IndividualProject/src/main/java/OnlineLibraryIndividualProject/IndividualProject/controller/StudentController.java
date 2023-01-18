package OnlineLibraryIndividualProject.IndividualProject.controller;

import OnlineLibraryIndividualProject.IndividualProject.entity.Student;
import OnlineLibraryIndividualProject.IndividualProject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/student")
@CrossOrigin(origins = "*")
public class StudentController {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        studentRepository.save(student);
        return "the student was saved!!!";
    }
}
