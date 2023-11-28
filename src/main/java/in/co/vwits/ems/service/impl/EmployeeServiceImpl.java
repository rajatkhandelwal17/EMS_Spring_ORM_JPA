package in.co.vwits.ems.service.impl;
import java.util.Comparator;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.co.vwits.ems.dao.EmployeeDAO;
import in.co.vwits.ems.model.Employee;
import in.co.vwits.ems.service.EmployeeService;

@Service
@Transactional 
public class EmployeeServiceImpl implements EmployeeService {
    
	@Autowired
	private EmployeeDAO employeeDAO;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeDAO.getEmployeeById(id);
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeDAO.addEmployee(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeDAO.updateEmployee(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployee(id);
    }
    
    @Override
	public List<Employee> sortEmployeesByName() {
	    return employeeDAO.getAllEmployees()
	              .stream()
	              .sorted(Comparator.comparing(Employee::getName))
	              .collect(Collectors.toList());
	}
    
    public List<Employee> sortEmployeesBySalary() {
	    return employeeDAO.getAllEmployees()
	              .stream()
	              .sorted(Comparator.comparing(Employee::getSalary))
	              .collect(Collectors.toList());
	}
}
