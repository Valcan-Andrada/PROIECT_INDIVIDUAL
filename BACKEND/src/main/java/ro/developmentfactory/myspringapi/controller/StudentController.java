package ro.developmentfactory.myspringapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.developmentfactory.myspringapi.entity.Student;
import ro.developmentfactory.myspringapi.service.StudentService;
import  java.lang.String;
import java.util.List;

@RestController
@RequestMapping( "api/student")
@CrossOrigin(origins = "*")
public class StudentController {
    private final StudentService studentService;


    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        student.setCNP("62819271729182");
        studentService.saveStudent(student);
        System.out.println(student.getName());
        System.out.println(student.getCNP());
        return "saved";
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping(value="/register")
    public List<Student> checkRegister(@RequestBody Student student){
        System.out.println(student.getEmail());
        String email = student.getEmail();
        List<Student> st = studentService.findStudent(email);
        System.out.println(st);
        return st;
    }
    @PostMapping(value = "createStudent")
    public void createStudent(Student student){

    }

    @GetMapping("/findStudent/{email}")
        public List<Student> findStudent(@PathVariable String email){
            return studentService.findStudent(email);
        }
    }
