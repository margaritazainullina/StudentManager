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
public class GroupController {

    ApplicationContext appContext = new ClassPathXmlApplicationContext("springAOP.xml");

    @Autowired
    private GroupService groupService;

    @RequestMapping("/group")
    public String listGroups(Map<String, Object> map) {

        GroupImpl g = (GroupImpl) appContext.getBean("group");
        map.put("group", g);
        map.put("groupList", groupService.listGroup());

        return "group";
    }

    @RequestMapping("/")
    public String home() {
        return "redirect:/group";
    }

    @RequestMapping(value = "/add/group", method = RequestMethod.POST)
    public String addSpeciality(@ModelAttribute("group") GroupImpl group,
            BindingResult result) {

        groupService.addGroup(group);

        return "redirect:/group";
    }

    @RequestMapping("/delete/group/{groupId}")
    public String deleteSpecialities(@PathVariable("groupId") Integer groupId) {

        groupService.removeGroup(groupId);

        return "redirect:/group";
    }
}
