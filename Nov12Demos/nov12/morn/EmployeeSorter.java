package com.ford.nov12.morn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeSorter {
    ArrayList <Employee> employees;
    public EmployeeSorter()
    {
        employees = new ArrayList<Employee>();
        employees.add(new Employee("E002","Chandu","Ahmedabad","9499499494",12000));
        employees.add(new Employee("E001","Amarnath","Faridabad","9499499494",10000));
        employees.add(new Employee("E003","Babu","Coimbatore","9499499494",14000));

    }

    public ArrayList<Employee> getSortedEmployeesById()
    {
        Collections.sort(employees,new EmployeeIdSorter());
        System.out.println("Employees Sorted By Id ..");
        Iterator <Employee> empIdIter = employees.iterator();
        while(empIdIter.hasNext())
        {
            Employee employee = empIdIter.next();
            System.out.println(employee);

        }
        return employees;
    }
    public ArrayList <Employee> getSortedEmployeesByName()
    {
        Collections.sort(employees,new EmployeeNameSorter());
        System.out.println("Employees Sorted By Name ..");
        Iterator <Employee> empIdIter = employees.iterator();
        while(empIdIter.hasNext())
        {
            Employee employee = empIdIter.next();
            System.out.println(employee);

        }
        return employees;
    }
    public ArrayList <Employee> getSortedEmployeesBySalary()
    {
        Collections.sort(employees,new EmployeeSalarySorter());
        System.out.println("Employees Sorted By Salary ..");
        Iterator <Employee> empIdIter = employees.iterator();
        while(empIdIter.hasNext())
        {
            Employee employee = empIdIter.next();
            System.out.println(employee);

        }
        return employees;
    }




}
