package pro.sky.skyprogenericsmaphw.service.service;

import pro.sky.skyprogenericsmaphw.model.Employee;

import java.util.Collection;

public interface EmployeeService  {

    Employee add(String firsName, String lastName);

    Employee remove(String firsName, String lastName);

    Employee find(String firsName, String lastName);

    Collection<Employee> findAll();
}
