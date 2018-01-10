package Service;

import Entity.Student;
import Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public List<Student> getAllStudent()
    {
        List<Student> students =new ArrayList<>();
        studentRepository.findAll()
                .forEach(students::add);
        return students;
    }
    public void addStudent(Student student)
    {studentRepository.save(student);}
    public Student getStudent(String id){return studentRepository.findOne(id);}
    public void updateStudent(String id ,Student student){studentRepository.save(student);
    }
    public void deleteStudent(String id){studentRepository.delete(id);}
}
