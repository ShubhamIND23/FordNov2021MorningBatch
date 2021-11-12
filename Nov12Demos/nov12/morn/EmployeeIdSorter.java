package com.ford.nov12.morn;

import java.util.Comparator;

public class EmployeeIdSorter implements Comparator <Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.employeeId.compareTo(o2.employeeId) > 0)
        {
            return 1;
        }
        else if(o1.employeeId.compareTo(o2.employeeId) < 0)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
