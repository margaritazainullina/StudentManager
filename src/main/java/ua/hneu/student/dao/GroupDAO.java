package ua.hneu.student.dao;

import java.util.List;
import ua.hneu.student.domain.GroupImpl;

public interface GroupDAO {

    public void addGroup(GroupImpl g);

    public List<GroupImpl> listGroup();

    public void removeGroup(Integer id);
    
}
