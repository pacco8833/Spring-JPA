package net.genspark.Email.Repository;

import net.genspark.Email.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {
}
