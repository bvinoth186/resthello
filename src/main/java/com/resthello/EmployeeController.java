package com.resthello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    
    @Autowired
    private EmployeeRepository employeeRepository;
	
	@RequestMapping("/")
    public List<Employee> getEmployees() 
    {
		/*List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1,"vinoth","kumar","vinoth186@gmail.com"));*/
	    
	    List<Employee> employeesList = employeeRepository.findAll();
		return employeesList;
    }

}
