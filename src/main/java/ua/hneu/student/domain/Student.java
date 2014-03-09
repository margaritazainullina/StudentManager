package ua.hneu.student.domain;

import java.util.Set;

public interface Student {

    public Integer getStudentId();

    public void setStudentId(Integer studentId);

    public String getFirstname();

    public void setFirstname(String firstname);

    public String getLastname();

    public void setLastname(String lastname);

    public String getEmail();

    public void setEmail(String email);

    public String getTelephone();

    public void setTelephone(String telephone);

    public String getAbout();

    public void setAbout(String about);

    public GroupImpl getGroup();

    public void setGroup(GroupImpl group);

}
