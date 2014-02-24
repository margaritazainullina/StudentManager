package ua.hneu.student.service;

import java.util.List;
import ua.hneu.student.domain.Group;

public interface GroupService {

	public void addGroup(Group s);

	public List<Group> listGroup();

	public void removeGroup(Integer id);
}
