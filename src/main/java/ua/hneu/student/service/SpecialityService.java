package ua.hneu.student.service;

import java.util.List;
import ua.hneu.student.domain.Speciality;
public interface SpecialityService {

    public void addSpeciality(Speciality speciality);

    public List<Speciality> listSpeciality();

    public void removeSpeciality(Integer id);
}