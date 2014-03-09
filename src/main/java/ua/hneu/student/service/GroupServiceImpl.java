package ua.hneu.student.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.hneu.student.dao.GroupDAO;
 
import ua.hneu.student.domain.GroupImpl;
 
@Service
public class GroupServiceImpl implements GroupService {
 
    @Autowired
    private GroupDAO groupDAO;
 
    @Transactional
    public void addGroup(GroupImpl group) {
        groupDAO.addGroup(group);
    }
 
    @Transactional
    public List<GroupImpl> listGroup() {
 
        return groupDAO.listGroup();
    }
 
    @Transactional
    public void removeGroup(Integer id) {
        groupDAO.removeGroup(id);
    }
}
