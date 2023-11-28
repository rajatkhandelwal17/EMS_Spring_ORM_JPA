package in.co.vwits.ems.dao.impl;

import java.util.ArrayList;
import java.util.List;

import in.co.vwits.ems.dao.EmployeeDAO;
import in.co.vwits.ems.model.Employee;

public class EmployeeDaoImpl implements EmployeeDAO {
    private List<Employee> employees = new ArrayList<>();

    public EmployeeDaoImpl() {
 
        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setName("Rohan");
        employee1.setSalary(50000);

        Employee employee2 = new Employee();
        employee2.setId(2);
        employee2.setName("Shanaya");
        employee2.setSalary(60000);

        Employee employee3 = new Employee();
        employee3.setId(3);
        employee3.setName("Abhishek");
        employee3.setSalary(55000);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == employee.getId()) {
                employees.set(i, employee);
                break;
            }
        }
    }

    @Override
    public void deleteEmployee(int id) {
        employees.removeIf(employee -> employee.getId() == id);
    }

}