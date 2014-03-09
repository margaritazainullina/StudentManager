package ua.hneu.student.service;

import java.util.List;
import ua.hneu.student.domain.GroupImpl;

public interface GroupService {

	public void addGroup(GroupImpl s);

	public List<GroupImpl> listGroup();

	public void removeGroup(Integer id);
}
