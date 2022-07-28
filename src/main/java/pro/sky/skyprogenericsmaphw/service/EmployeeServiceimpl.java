package pro.sky.skyprogenericsmaphw.service;

import pro.sky.skyprogenericsmaphw.exception.EmployeeAlreadyAddedException;
import pro.sky.skyprogenericsmaphw.exception.exception.EmployeeNotFoundException;
import pro.sky.skyprogenericsmaphw.model.Employee;
import pro.sky.skyprogenericsmaphw.service.service.EmployeeService;

import java.util.*;

public class EmployeeServiceimpl implements EmployeeService {
    private final Map < String, Employee> employees;

    public Employee EmployeeServiceimpl(List<Employee> employeeList) throws EmployeeAlreadyAddedException {
        this.employees = new HashMap<>();


        @Override
        public Employee add(String firsName, String lastName){
            Employee employee = new Employee(firstName, lastName);
            if (employees.containsKey(employee.getFullName())) {
                throw new EmployeeAlreadyAddedException();
                return employee;
            }
            employeeList.put(employee.getFullName(),employee);
            return employee;
        }
        @Override
        public Employee remove (String firsName, String lastName){
            Employee employee = new Employee(firstName, lastName);
            if (employees.containsKey(employee.getFullName())) {
               return employees.remove(employee.getFullName());
            }
            throw new EmployeeNotFoundException();
        }
        @Override
        public Employee find (String firsName, String lastName){
            Employee employee = new Employee(firstName, lastName);
            if (employees.containsKey(employee.getFullName())) {
                return employees.get(employee.getFullName());
            }
            throw new EmployeeNotFoundException();
        }
    }

    @Override
    public Collection<Employee> findAll() {
        return Collections.unmodifiableCollection(employees.values());
    }
}

