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
public class Speciality {

    @Id
    @Column(name = "specialityId")
    @GeneratedValue
    private Integer specialityId;

    @Column(name = "SPECIALITY")
    private String speciality;

    @OneToMany(mappedBy = "speciality")
    private Set<Group> groups;

    
    public Integer getSpecialityId() {
        return specialityId;
    }

    public void setspecialityId(Integer specialityId) {
        this.specialityId = specialityId;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Set<Group> getGroups() {
        return groups;
    }

    public void setGroups(Set<Group> groups) {
        this.groups = groups;
    }

   
}