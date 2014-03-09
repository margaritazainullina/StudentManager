package ua.hneu.student.service;

import java.util.List;
import ua.hneu.student.domain.StudentImpl;

public interface StudentService {

	public void addStudent(StudentImpl s);

	public List<StudentImpl> listStudent();

	public void removeStudent(Integer id);
}
