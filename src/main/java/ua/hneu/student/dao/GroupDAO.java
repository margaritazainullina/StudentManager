package ua.hneu.student.dao;

import java.util.List;
import ua.hneu.student.domain.Group;

public interface GroupDAO {

    public void addGroup(Group g);

    public List<Group> listGroup();

    public void removeGroup(Integer id);
}
