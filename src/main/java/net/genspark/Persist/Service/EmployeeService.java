package net.genspark.Email.Service;

import net.genspark.Email.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    public void createEmployee(Employee e);
    public Employee readEmployee(int id);
    public List<Employee> readEmployees();
    public void updateEmployee(int id, String role);
    public void deleteEmployee(int id);
}
