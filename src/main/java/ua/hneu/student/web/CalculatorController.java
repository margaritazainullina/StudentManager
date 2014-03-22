package ua.hneu.student.web;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import service.CalculatorService;
import ua.hneu.student.domain.Data;
import ua.hneu.student.domain.GroupImpl;

@Controller

public class CalculatorController {

    Data g = new Data();
    CalculatorService s = new CalculatorService();

    @RequestMapping("/")
    public String home() {
        return "redirect:/calc";
    }

    @RequestMapping("/calc")
    public String start(Map<String, Object> map) {
        map.put("data", g);
        return "calc";
    }

    @RequestMapping(value = "/add/data", method = RequestMethod.POST)
    public String addValue(@ModelAttribute("data") Data d,
            BindingResult result) {

        d.setResult(s.add(d.getA(), d.getB()));

        return "redirect:/calc";
    }
}
