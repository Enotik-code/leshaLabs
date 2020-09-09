package works.number1.service;

import works.number1.bean.Employee;

import java.util.List;

public class EmployeeService {

    public void getEmployee(Employee employee){
        System.out.println(employee.toString());
    }

    public void getListOfEmployee(List<Employee> employeeList){
        System.out.println(employeeList.toString());
    }

    public void getEmployeeWhichHavingChild(List<Employee> employeeList){
        for (int i = 0; i < employeeList.size(); i++) {
            if(employeeList.get(i).isHavingChildren())
                System.out.println(employeeList.get(i));
        }
    }
}
