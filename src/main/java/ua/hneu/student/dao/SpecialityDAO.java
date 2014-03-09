package ua.hneu.student.dao;

import java.util.List;
import ua.hneu.student.domain.SpecialityImpl;

public interface SpecialityDAO {

    public void addSpeciality(SpecialityImpl s);

    public List<SpecialityImpl> listSpeciality();

    public void removeSpeciality(Integer id);
}
