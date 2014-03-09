package ua.hneu.student.domain;

import java.util.Set;

public interface Speciality {

    public Integer getSpecialityId();

    public void setspecialityId(Integer specialityId);

    public String getSpeciality();

    public void setSpeciality(String speciality);

    public Set<GroupImpl> getGroups();

    public void setGroups(Set<GroupImpl> groups);

}
