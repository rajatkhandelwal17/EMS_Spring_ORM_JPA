package in.co.vwits.ems.dao;
import java.util.List;

import in.co.vwits.ems.model.Employee;

public interface EmployeeDAO {
	
    List<Employee> getAllEmployees();
    Employee getEmployeeById(int id);
    
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);
}