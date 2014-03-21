package ua.hneu.student.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.hneu.student.domain.GroupImpl;
import ua.hneu.student.service.GroupService;

@Controller
public class CalculatorController {


    @RequestMapping("/")
    public String home() {
        return "redirect:/calculator";
    }

    @RequestMapping(value = "/calc/add", method = RequestMethod.POST)
    public String add() {
        System.out.println("!!!!!!!!!!!!!");
        return "redirect:/calculator";
    }
    
}
