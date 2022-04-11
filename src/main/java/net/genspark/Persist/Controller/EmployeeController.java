package net.genspark.Email.Controller;

import net.genspark.Email.Entity.Employee;
import net.genspark.Email.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employees;

    @GetMapping("/")
    public String initialMsg() {
        return "<h1> Sup Yo.</h1>" +
                "<h2> Employee Controller Active.</h2>";
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employees.readEmployees();
    }

    @PostMapping("/employee")
    public void hireEmployee(@RequestBody Employee guy) {
        employees.createEmployee(guy);
    }

}
