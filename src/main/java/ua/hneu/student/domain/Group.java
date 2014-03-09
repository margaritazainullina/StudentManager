/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.hneu.student.domain;

import java.util.Set;

public interface Group {

    public Integer getGroupId();

    public void setGroupId(Integer groupId);

    public String getGroupName();

    public void setGroupName(String groupName);

    public SpecialityImpl getSpeciality();

    public void setSpeciality(SpecialityImpl speciality);

    public Set<StudentImpl> getStudent();

    public void setStudent(Set<StudentImpl> student);
}
