package ua.hneu.student.dao;

import java.util.List;

import ua.hneu.student.domain.Student;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addStudent(Student student) {
        sessionFactory.getCurrentSession().save(student);
    }

    @SuppressWarnings("unchecked")
    public List<Student> listStudent() {

        return sessionFactory.getCurrentSession().createQuery("from Student")
                .list();
    }

    public void removeStudent(Integer id) {
        Student student = (Student) sessionFactory.getCurrentSession().load(
                Student.class, id);
        if (null != student) {
            sessionFactory.getCurrentSession().delete(student);
        }

    }
}
