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
import ua.hneu.student.domain.StudentImpl;
import ua.hneu.student.service.StudentService;

@Controller
public class StudentController {
    
    ApplicationContext appContext = new ClassPathXmlApplicationContext("springAOP.xml");

	@Autowired
	private StudentService studentService;

	@RequestMapping("/index")
	public String listStudents(Map<String, Object> map) {
            
                StudentImpl s = (StudentImpl) appContext.getBean("student");
		map.put("student", s);
		map.put("studentList", studentService.listStudent());

		return "student";
	}
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/index";
	}

	@RequestMapping(value = "/add/student", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("student") StudentImpl student,
			BindingResult result) {

		studentService.addStudent(student);

		return "redirect:/index";
	}

	@RequestMapping("/delete/student/{studentId}")
	public String deleteStudent(@PathVariable("studentId") Integer studentId) {

		studentService.removeStudent(studentId);

		return "redirect:/index";
	}
}
