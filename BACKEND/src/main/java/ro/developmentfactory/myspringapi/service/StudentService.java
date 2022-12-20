package ro.developmentfactory.myspringapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.developmentfactory.myspringapi.entity.Student;
import ro.developmentfactory.myspringapi.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public List<Student> findStudent(String email){

       // System.out.println(studentRepository.findByEmail(email));
        return  studentRepository.findByEmail(email);
    }

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }
}
