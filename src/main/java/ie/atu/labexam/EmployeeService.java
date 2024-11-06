package ie.atu.labexam;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> myList = new ArrayList<>();
    public List<Employee> addEmployee(Employee employee)
    {
        myList.add(employee);
        return myList;
    }

    public List<Employee> putEmployee (Employee employee, String employeeCode)
    {
        for(int i=0; i < myList.size(); i++){
            if(myList.get(i).getEmployeeCode() == employeeCode)
                myList.set(i, employee);
        }
        return myList;
    }

    public List<Employee> deleteEmployee(String employeeCode)
    {
        for(int count = 0;count < myList.size(); count++)
        {
            if(myList.get(count).getEmployeeCode() == employeeCode) myList.remove(count);
        }
        return myList;
    }

}
