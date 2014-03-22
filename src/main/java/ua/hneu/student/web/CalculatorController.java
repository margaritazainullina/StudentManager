package ua.hneu.student.web;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.hneu.student.domain.Data;
import ua.hneu.student.domain.GroupImpl;

@Controller

public class CalculatorController {

    @RequestMapping("/")
    public String home() {
        return "redirect:/calc";
    }

    @RequestMapping("/calc")
    public String listGroups(Map<String, Object> map) {

        Data g = new Data();
        map.put("data", g);

        return "calc";
    }

//    @RequestMapping(value = "/calc", method = RequestMethod.GET)
//    public String printHello(ModelMap model) {
//        model.addAttribute("message", "Hello Spring MVC Framework!");
//
//        return "calc";
//    }
    /*@RequestMapping(value = "/add/data", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("data") Data d,
            ModelMap model) {
        model.addAttribute("a", d.getA());
        model.addAttribute("b", d.getB());

        return "redirect:/calc";
    }*/

    @RequestMapping(value = "/add/data", method = RequestMethod.POST)
    public String addSpeciality(@ModelAttribute("data") Data d,
            BindingResult result) {

        d.setA(4);

        return "redirect:/calc";
    }
}
