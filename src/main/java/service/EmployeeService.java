package service;

import domain.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();
    Employee create(Employee employee);
    void delete(Long id);
    Employee update(Employee employee);
    Employee getEmployeeById(Long id);

}
