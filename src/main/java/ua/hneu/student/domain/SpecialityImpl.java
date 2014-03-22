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

    @Override
    public Integer getSpecialityId() {
        return specialityId;
    }

    @Override
    public void setSpecialityId(Integer specialityId) {
        if (specialityId == null) {
            throw new IllegalArgumentException();
        } else {
            this.specialityId = specialityId;
            System.out.println("555");
        }
    }

    @Override
    public String getSpeciality() {
        return speciality;
    }

    @Override
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public Set<GroupImpl> getGroups() {
        return groups;
    }

    @Override
    public void setGroups(Set<GroupImpl> groups) {
        this.groups = groups;
    }

}
