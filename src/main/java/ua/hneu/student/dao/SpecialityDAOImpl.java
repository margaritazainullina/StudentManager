package ua.hneu.student.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.hneu.student.domain.Speciality;

@Repository
public class SpecialityDAOImpl implements SpecialityDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addSpeciality(Speciality speciality) {
        sessionFactory.getCurrentSession().save(speciality);
    }

    @SuppressWarnings("unchecked")
    public List<Speciality> listSpeciality() {
        return sessionFactory.getCurrentSession().createQuery("from Speciality")
                .list();
    }

    public void removeSpeciality(Integer id) {
        Speciality speciality = (Speciality) sessionFactory.getCurrentSession().load(
                Speciality.class, id);
        if (null != speciality) {
            sessionFactory.getCurrentSession().delete(speciality);
        }

    }
}
