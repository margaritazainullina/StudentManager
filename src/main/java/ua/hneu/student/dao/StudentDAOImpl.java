package ua.hneu.student.dao;

import java.util.List;

import ua.hneu.student.domain.StudentImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addStudent(StudentImpl student) {
        sessionFactory.getCurrentSession().save(student);
    }

    @SuppressWarnings("unchecked")
    public List<StudentImpl> listStudent() {

        return sessionFactory.getCurrentSession().createQuery("from StudentImpl")
                .list();
    }

    public void removeStudent(Integer id) {
        StudentImpl student = (StudentImpl) sessionFactory.getCurrentSession().load(
                StudentImpl.class, id);
        if (null != student) {
            sessionFactory.getCurrentSession().delete(student);
        }

    }
}
