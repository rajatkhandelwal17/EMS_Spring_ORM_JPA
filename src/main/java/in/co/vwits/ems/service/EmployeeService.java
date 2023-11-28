package in.co.vwits.ems.service;

import java.util.List;

import in.co.vwits.ems.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();
	Employee getEmployeeById(int id);
	
	void addEmployee(Employee employee);
	void updateEmployee(Employee employee);
	void deleteEmployee(int id);
	
	List<Employee> sortEmployeesByName();
	List<Employee> sortEmployeesBySalary();
}