package ua.hneu.student.domain;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Groups")
public class GroupImpl implements Group {

    @Id
    @Column(name = "groupId")
    @GeneratedValue
    private Integer groupId;

    @Column(name = "groupName")
    private String groupName;

    @ManyToOne
    @JoinColumn(name = "specialityId")
    SpecialityImpl speciality;

    @OneToMany(mappedBy = "group")
    private Set<StudentImpl> student;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        if (groupId == null) {
            throw new IllegalArgumentException();
        } else {
            this.groupId = groupId;
        }
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public SpecialityImpl getSpeciality() {
        return speciality;
    }

    public void setSpeciality(SpecialityImpl speciality) {
        this.speciality = speciality;
    }

    public Set<StudentImpl> getStudent() {
        return student;
    }

    public void setStudent(Set<StudentImpl> student) {
        this.student = student;
    }
}
