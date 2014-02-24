package ua.hneu.student.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import ua.hneu.student.dao.StudentDAO;
import ua.hneu.student.domain.Student;
 
@Service
public class StudentServiceImpl implements StudentService {
 
    @Autowired
    private StudentDAO studentDAO;
 
    @Transactional
    public void addStudent(Student student) {
        studentDAO.addStudent(student);
    }
 
    @Transactional
    public List<Student> listStudent() {
 
        return studentDAO.listStudent();
    }
 
    @Transactional
    public void removeStudent(Integer id) {
        studentDAO.removeStudent(id);
    }
}
