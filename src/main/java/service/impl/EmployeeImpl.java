package service.impl;

import Repo.EmployeeRepo;
import domain.Employee;
import exception.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.EmployeeService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
@Transactional
public class EmployeeImpl implements EmployeeService {


    @Autowired
    private final EmployeeRepo employeeRepo;


    @Override
    public List<Employee> getAllEmployee() {
        return  employeeRepo.findAll();
    }

    @Override
    public Employee create(Employee employee) {
        employee.setStaffID(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    @Override
    public void delete(Long id) {
         employeeRepo.deleteById(id);

    }

    @Override
    public Employee update(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepo.findById(id).orElseThrow(() -> new UserNotFoundException("User by id" + id + "was not found"));
    }
}
