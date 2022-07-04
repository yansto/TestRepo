package eu.endoo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping()
public class TestController {

    final
    EmployeeDAO employeeDAO;

    public TestController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @GetMapping(path = "/users", produces = "application/json")
    public Employees GetEmployees(){
        return employeeDAO.getAllEmployees();}
}
