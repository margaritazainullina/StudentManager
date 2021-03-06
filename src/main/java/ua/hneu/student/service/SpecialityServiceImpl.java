package ua.hneu.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.hneu.student.dao.SpecialityDAO;
import ua.hneu.student.domain.SpecialityImpl;

@Service
public class SpecialityServiceImpl implements SpecialityService {

    @Autowired
    private SpecialityDAO specialityDAO;

    @Transactional
    public void addSpeciality(SpecialityImpl speciality) {
        specialityDAO.addSpeciality(speciality);
    }

    @Transactional
    public List<SpecialityImpl> listSpeciality() {

        return specialityDAO.listSpeciality();
    }

    @Transactional
    public void removeSpeciality(Integer id) {
        specialityDAO.removeSpeciality(id);
    }
    
}
