package ua.hneu.student.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.hneu.student.domain.GroupImpl;

@Repository
public class GroupDAOImpl implements GroupDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addGroup(GroupImpl group) {
        sessionFactory.getCurrentSession().save(group);
    }

    @SuppressWarnings("unchecked")
    public List<GroupImpl> listGroup() {
        return sessionFactory.getCurrentSession().createQuery("from GroupImpl")
                .list();
    }

    public void removeGroup(Integer id) {
        GroupImpl group = (GroupImpl) sessionFactory.getCurrentSession().load(
                GroupImpl.class, id);
        if (null != group) {
            sessionFactory.getCurrentSession().delete(group);
        }
    }
    
}
