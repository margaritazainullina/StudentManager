package ua.hneu.student.dao;

import java.util.List;
import ua.hneu.student.domain.Student;

public interface StudentDAO {

	public void addStudent(Student s);

	public List<Student> listStudent();

	public void removeStudent(Integer id);
}