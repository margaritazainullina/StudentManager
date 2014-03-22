package ua.hneu.student.domain;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENTS")
public class StudentImpl implements Student {

    @Id
    @Column(name = "studentId")
    @GeneratedValue
    private Integer studentId;

    @Column(name = "FIRSTNAME")
    private String firstname;

    @Column(name = "LASTNAME")
    private String lastname;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "TELEPHONE")
    private String telephone;

    @Column(name = "ABOUT")
    private String about;

    @ManyToOne
    @JoinColumn(name = "groupId")
    GroupImpl group;

    @Override
    public Integer getStudentId() {
        return studentId;
    }

    @Override
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public String getFirstname() {
        return firstname;
    }

    @Override
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String getLastname() {
        return lastname;
    }

    @Override
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getTelephone() {
        return telephone;
    }

    @Override
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAbout() {
        return about;
    }

    @Override
    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public GroupImpl getGroup() {
        return group;
    }

    @Override
    public void setGroup(GroupImpl group) {
        this.group = group;
    }

}
