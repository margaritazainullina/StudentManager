package ua.hneu.student.service;

import java.util.List;
import ua.hneu.student.domain.SpecialityImpl;
public interface SpecialityService {

    public void addSpeciality(SpecialityImpl speciality);

    public List<SpecialityImpl> listSpeciality();

    public void removeSpeciality(Integer id);
}