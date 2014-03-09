package ua.hneu.student.dao;

import java.util.List;
import ua.hneu.student.domain.StudentImpl;

public interface StudentDAO {

	public void addStudent(StudentImpl s);

	public List<StudentImpl> listStudent();

	public void removeStudent(Integer id);
}