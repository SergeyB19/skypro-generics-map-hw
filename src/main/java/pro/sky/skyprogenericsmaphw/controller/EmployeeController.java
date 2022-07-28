package pro.sky.skyprogenericsmaphw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprogenericsmaphw.model.Employee;
import pro.sky.skyprogenericsmaphw.service.EmployeeServiceimpl;

@RestController
public class EmployeeController {
    private final EmployeeServiceimpl employeeServiceimpl;

    public EmployeeController(EmployeeServiceimpl employeeServiceimpl) {
        this.employeeServiceimpl = employeeServiceimpl;
    }

    @GetMapping(path = "/Employee/add")
    public String addEmployee(@RequestParam("firstName") String firstName,
                              @RequestParam("lastName") String lastName) {
        Employee employee = new Employee(firstName, lastName);
        employeeServiceimpl.add(employee);
        return "Сотрудник добавлен";
    }

    @GetMapping(path = "/Employee/remove")
    public String removeEmployee(@RequestParam("firstName") String firstName,
                                 @RequestParam("lastName") String lastName) {
        Employee employee = new Employee(firstName, lastName);
        employeeServiceimpl.remove(employee);
        return "Сотрудник удален";
    }

    @GetMapping(path = "/Employee/find")
    public String findEmployee(@RequestParam("firstName") String firstName,
                               @RequestParam("lastName") String lastName) {
        Employee employee = new Employee(firstName, lastName);
        employeeServiceimpl.find(employee);
        return "Сотрудник найден";
    }
}


