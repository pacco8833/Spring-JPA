package net.genspark.Email.Service;

import net.genspark.Email.Entity.Employee;
import net.genspark.Email.Repository.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeRegister implements EmployeeService {

    @Autowired
    private EmployeeDao db;

    @Override
    public void createEmployee(Employee e) {
        db.save(e);
    }

    @Override
    public Employee readEmployee(int id) {
        return db.getById(id);
    }

    @Override
    public List<Employee> readEmployees() {
        return db.findAll();
    }

    @Override
    public void updateEmployee(int id, String role) {
        Employee guy = readEmployee(id);
        guy.setRole(role);
        db.save(guy);
    }

    @Override
    public void deleteEmployee(int id) {
        Employee guy = readEmployee(id);
        db.delete(guy);
        db.save(guy);
    }
}
