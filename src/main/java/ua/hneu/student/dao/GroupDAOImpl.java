package ua.hneu.student.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.hneu.student.domain.Group;

@Repository
public class GroupDAOImpl implements GroupDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addGroup(Group group) {
        sessionFactory.getCurrentSession().save(group);
    }

    @SuppressWarnings("unchecked")
    public List<Group> listGroup() {
        return sessionFactory.getCurrentSession().createQuery("from Group")
                .list();
    }

    public void removeGroup(Integer id) {
        Group group = (Group) sessionFactory.getCurrentSession().load(
                Group.class, id);
        if (null != group) {
            sessionFactory.getCurrentSession().delete(group);
        }

    }
}
