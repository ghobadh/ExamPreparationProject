package predicateExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static predicateExample.EmployeePredicates.*;

public class TestEmployeePredicates
{
    public static void main(String[] args)
    {
        Employee e1 = Employee.hireEmployee(1,23,"M","Rick","Beethovan");
        Employee e2 = Employee.hireEmployee(2,13,"F","Martina","Hengis");
        Employee e3 = Employee.hireEmployee(3,43,"M","Ricky","Martin");
        Employee e4 = Employee.hireEmployee(4,26,"M","Jon","Lowman");
        Employee e5 = Employee.hireEmployee(5,19,"F","Cristine","Maria");
        Employee e6 = Employee.hireEmployee(6,15,"M","David","Feezor");
        Employee e7 = Employee.hireEmployee(7,68,"F","Melissa","Roy");
        Employee e8 = Employee.hireEmployee(8,79,"M","Alex","Gussin");
        Employee e9 = Employee.hireEmployee(9,15,"F","Neetu","Singh");
        Employee e10 = Employee.hireEmployee(10,45,"M","Naveen","Jain");

        List<Employee> employees = new ArrayList<Employee>();
        employees.addAll(Arrays.asList(new Employee[]{e1,e2,e3,e4,e5,e6,e7,e8,e9,e10}));

        System.out.println( filterEmployees(employees, isAdultMale()) );

        System.out.println( filterEmployees(employees, isAdultFemale()) );

        System.out.println( filterEmployees(employees, isAgeMoreThan(35)) );

        //Employees other than above collection of "isAgeMoreThan(35)"
        //can be get using negate()
        System.out.println(filterEmployees(employees, isAgeMoreThan(35).negate()));
    }
}