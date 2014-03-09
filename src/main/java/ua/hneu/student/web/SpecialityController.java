package ua.hneu.student.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.hneu.student.domain.Speciality;
import ua.hneu.student.domain.SpecialityImpl;
import ua.hneu.student.service.SpecialityService;

@Controller
public class SpecialityController {

    @Autowired
    private SpecialityService specialityService;

    @RequestMapping("/speciality")
    public String listSpecialities(Map<String, Object> map) {

        map.put("speciality", new SpecialityImpl());
        map.put("specialityList", specialityService.listSpeciality());

        return "speciality";
    }

    @RequestMapping("/")
    public String home() {
        return "redirect:/speciality";
    }

    @RequestMapping(value = "/add/speciality", method = RequestMethod.POST)
    public String addSpeciality(@ModelAttribute("speciality") SpecialityImpl speciality,
            BindingResult result) {

        specialityService.addSpeciality(speciality);

        return "redirect:/speciality";
    }

    @RequestMapping("/delete/speciality/{specialityId}")
    public String deleteSpecialities(@PathVariable("specialityId") Integer specialityId) {

        specialityService.removeSpeciality(specialityId);

        return "redirect:/speciality";
    }
}
