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

    @RequestMapping(value = "/calc", method = RequestMethod.POST, params = {"add"})
    public String addValue(@ModelAttribute("data") Data d,
            BindingResult result) {
        d.setResult(s.add(d.getA(), d.getB()));
        return "calc";
    }

    @RequestMapping(value = "/calc", method = RequestMethod.POST, params = {"minus"})
    public String minusValue(@ModelAttribute("data") Data d,
            BindingResult result) {
        d.setResult(s.minus(d.getA(), d.getB()));
        return "calc";
    }

    @RequestMapping(value = "/calc", method = RequestMethod.POST, params = {"multiply"})
    public String multiplyValue(@ModelAttribute("data") Data d,
            BindingResult result) {
        d.setResult(s.multiply(d.getA(), d.getB()));
        return "calc";
    }

    @RequestMapping(value = "/calc", method = RequestMethod.POST, params = {"divide"})
    public String divideValue(@ModelAttribute("data") Data d,
            BindingResult result) {
        d.setResult(s.divideDouble(d.getA(), d.getB()));
        return "calc";
    }

    @RequestMapping(value = "/calc", method = RequestMethod.POST, params = {"log"})
    public String logValue(@ModelAttribute("data") Data d,
            BindingResult result) {
        d.setResult(s.log(d.getA()));
        return "calc";
    }

}
