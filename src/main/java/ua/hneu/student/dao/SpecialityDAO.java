package ua.hneu.student.dao;

import java.util.List;
import ua.hneu.student.domain.Speciality;

public interface SpecialityDAO {

    public void addSpeciality(Speciality s);

    public List<Speciality> listSpeciality();

    public void removeSpeciality(Integer id);
}
