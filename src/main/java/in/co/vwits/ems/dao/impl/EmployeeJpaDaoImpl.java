package in.co.vwits.ems.dao.impl;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import in.co.vwits.ems.dao.EmployeeDAO;
import in.co.vwits.ems.model.Employee;

@Repository
public class EmployeeJpaDaoImpl implements EmployeeDAO{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Employee> getAllEmployees() {
		String jpql="FROM Employee";
		TypedQuery<Employee> query = em.createQuery(jpql,Employee.class);
		List<Employee> employeeList = query.getResultList();
		return employeeList; 
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee e = em.find(Employee.class, id); 
		return e;
	}

	@Override
	public void addEmployee(Employee employee) {
		em.persist(employee);   
	}

	@Override
	public void updateEmployee(Employee employee) {
		em.merge(employee); 
	}

	@Override
	public void deleteEmployee(int id) {
		em.remove(em.find(Employee.class, id));  
	}
}