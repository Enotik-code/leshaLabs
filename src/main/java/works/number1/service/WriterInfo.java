package works.number1.service;


import works.number1.bean.Employee;

import java.util.ArrayList;
import java.util.List;

public class WriterInfo {

    List<Employee> employeeList = new ArrayList<Employee>();

    public void createEmployee(){
        Employee employeeFirst = Employee.builder()
                .fullName("Иванов Иван Иванович")
                .salary(25.40)
                .havingChildren(false)
                .build();
        Employee employeeIvanov = new Employee("Петров Петр Петрович", 10.60, true);
        Employee employeePirogov = new Employee("Дмитриев Дмитрий Дмитриевич", true);
        employeeList.add(employeeFirst);
        employeeList.add(employeeIvanov);
        employeeList.add(employeePirogov);
    }

    public void getInfoAboutManagers() {
        EmployeeService employeeService = new EmployeeService();
        createEmployee();
        employeeService.getListOfEmployee(employeeList);
    }
}
