package com.ford.nov12.morn.functional;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaExprSample2 {

    public static void main(String[] args) {

        ArrayList <Supplier> suppliers = new ArrayList <Supplier> ();

        suppliers.add(new Supplier("S005","Zeenat","Faridabad",30000));
        suppliers.add(new Supplier("S006","Amarendar","Chennai",90000));
        suppliers.add(new Supplier("S004","Chandu","Bangalore",40000));
        suppliers.add(new Supplier("S003","Yasmeen","Dharwad",20000));
        suppliers.add(new Supplier("S002","Emanuel","Ahmedabad",50000));
        suppliers.add(new Supplier("S001","David","Bhopal",60000));

        System.out.println("------------Supplier Sorted By ID-------------");
        Collections.sort(suppliers, (s1,s2) -> {
            return s1.supplierId.compareTo(s2.supplierId);
        });
        for(Supplier s:suppliers)
        {
            System.out.println(s);
        }
        System.out.println("-----------------Supplier Sorted By Name----------------------------");
        Collections.sort(suppliers,(s1,s2) ->{
            return s1.supplierName.compareTo(s2.supplierName);
        });
        for(Supplier s:suppliers)
        {
            System.out.println(s);
        }
        System.out.println("-----------------Supplier Sorted By City----------------------------");
        Collections.sort(suppliers,(x,y) ->{
            return x.supplierCity.compareTo(y.supplierCity);
        });
        for(Supplier s:suppliers)
        {
            System.out.println(s);
        }

    }
}
