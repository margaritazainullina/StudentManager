package ua.hneu.student.service;

import java.util.List;
import ua.hneu.student.domain.Student;

public interface StudentService {

	public void addStudent(Student s);

	public List<Student> listStudent();

	public void removeStudent(Integer id);
}
