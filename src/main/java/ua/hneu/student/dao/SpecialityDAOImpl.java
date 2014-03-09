package ua.hneu.student.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.hneu.student.domain.SpecialityImpl;

@Repository
public class SpecialityDAOImpl implements SpecialityDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addSpeciality(SpecialityImpl speciality) {
        sessionFactory.getCurrentSession().save(speciality);
    }

    @SuppressWarnings("unchecked")
    public List<SpecialityImpl> listSpeciality() {
        return sessionFactory.getCurrentSession().createQuery("from SpecialityImpl")
                .list();
    }

    public void removeSpeciality(Integer id) {
        SpecialityImpl speciality = (SpecialityImpl) sessionFactory.getCurrentSession().load(
                SpecialityImpl.class, id);
        if (null != speciality) {
            sessionFactory.getCurrentSession().delete(speciality);
        }

    }
}
