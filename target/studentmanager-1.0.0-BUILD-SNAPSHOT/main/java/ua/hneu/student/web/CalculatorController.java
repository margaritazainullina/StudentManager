package ua.hneu.student.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.hneu.student.domain.Data;

@Controller

public class CalculatorController {

    @RequestMapping("/")
    public String home() {
        return "redirect:/service/calc";
    }

    @RequestMapping(value = "/service/calc", method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");

        return "calc";
    }

    @RequestMapping(value = "/service/calc/add/data", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("data") Data d,
            ModelMap model) {
        model.addAttribute("a", d.getA());
        model.addAttribute("b", d.getB());

        return "redirect:/service/calc";
    }

}
