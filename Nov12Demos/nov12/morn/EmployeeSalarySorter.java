package com.ford.nov12.morn;

import java.util.Comparator;

public class EmployeeSalarySorter implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.employeeSalary > o2.employeeSalary)
        {
            return 1;
        }
        else if(o1.employeeSalary < o2.employeeSalary)
        {
            return -1;
        }
        else
        {
            return 0;
        }


    }
}
