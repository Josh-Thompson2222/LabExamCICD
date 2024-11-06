package ie.atu.labexam;



import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
    private EmployeeService myEmployee;

    private List<Employee> myList = new ArrayList<>();
    public EmployeeController (EmployeeService myEmployee)
    {
        this.myEmployee = myEmployee;
    }

    @PostMapping("/newEmployee")
    public List<Employee> newEmployee(@RequestBody Employee employee)
    {
        return myEmployee.addEmployee(employee);
    }

    @PutMapping("/{employeeCode}")
    public List <Employee> updateEmployee (@Valid @PathVariable String employeeCode, @RequestBody Employee employee)
    {
        return myEmployee.putEmployee(employee, employeeCode);
    }

    @DeleteMapping("/deleteEmployee/{employeeCode}")
    public List <Employee> deleteEmployee (@PathVariable String employeeCode)
    {
        return myEmployee.deleteEmployee(employeeCode);
    }



}
