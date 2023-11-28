import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.co.vwits.ems.ApplicationConfiguration;
import in.co.vwits.ems.model.Employee;
import in.co.vwits.ems.service.EmployeeService;

public class TestEmployee {
	
    public static void main(String[] args){
    	
    	ApplicationContext container;                                               
		container = new AnnotationConfigApplicationContext(ApplicationConfiguration.class); 
		
		EntityManagerFactory factory = container.getBean(EntityManagerFactory.class);    	
        EmployeeService employeeService = container.getBean(EmployeeService.class);
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to Employee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Get Employee by ID");
            System.out.println("5. List All Employees");
            System.out.println("6. Sort Employees by Name");
            System.out.println("7. Sort Employees by Salary");
            System.out.println("8. Exit");
            System.out.print("\nEnter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                	Employee e1 = new Employee();
//                    System.out.println("Enter Employee Id: ");
//                    e1.setId(scanner.nextInt());
                    System.out.println("Enter Employee Name: ");
                    e1.setName(scanner.next());
                    System.out.println("Enter Employee Salary: ");
                    e1.setSalary(scanner.nextDouble());
                    employeeService.addEmployee(e1);
                    System.out.println("Employee added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Employee ID to update: ");
                    int q = scanner.nextInt();
                    
                    Employee existingEmployee = employeeService.getEmployeeById(q);
                    if (existingEmployee != null) {
                        System.out.print("Enter Employee New Name: ");
                        existingEmployee.setName(scanner.next());
                        System.out.print("Enter Employee New Salary: ");
                        existingEmployee.setSalary(scanner.nextDouble());
                        employeeService.updateEmployee(existingEmployee);
                        System.out.println("Employee updated successfully.");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = scanner.nextInt();
                    Employee employeeToDelete = employeeService.getEmployeeById(deleteId);
                    if (employeeToDelete != null) {
                        employeeService.deleteEmployee(deleteId);
                        System.out.println("Employee deleted successfully.");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to retrieve: ");
                    int retrieveId = scanner.nextInt();
                    Employee retrievedEmployee = employeeService.getEmployeeById(retrieveId);
                    if (retrievedEmployee != null) {
                        System.out.println("Employee details: " + retrievedEmployee.toString());

                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 5:
                    System.out.println("List of all employees:");
                    for (Employee employee : employeeService.getAllEmployees()) {
                        System.out.println(employee.toString());
                    }
                    break;

                case 6:
                	List<Employee> sortedEmployeesByName = employeeService.sortEmployeesByName();
                	for (Employee employee : sortedEmployeesByName) {
                	    System.out.println(employee.toString());
                	}
                    break;

                case 7:
                	List<Employee> sortedEmployeesBySalary = employeeService.sortEmployeesBySalary();
                	for (Employee employee : sortedEmployeesBySalary) {
                	    System.out.println(employee.toString());
                	}
                    break;

                case 8:
                    System.out.println("Exiting Employee Management System, Thank you Visit.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
