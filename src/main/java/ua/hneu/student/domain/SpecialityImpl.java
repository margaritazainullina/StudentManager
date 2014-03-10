package ua.hneu.student.domain;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SPECIALITIES")
public class SpecialityImpl implements Speciality {

    @Id
    @Column(name = "specialityId")
    @GeneratedValue
    private Integer specialityId;

    @Column(name = "SPECIALITY")
    private String speciality;

    @OneToMany(mappedBy = "speciality")
    private Set<GroupImpl> groups;

    public Integer getSpecialityId() {
        return specialityId;
    }

    public void setSpecialityId(Integer specialityId) {
        if (specialityId == null) {
            throw new IllegalArgumentException();
        } else {
            this.specialityId = specialityId;
        }
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Set<GroupImpl> getGroups() {
        return groups;
    }

    public void setGroups(Set<GroupImpl> groups) {
        this.groups = groups;
    }

}
