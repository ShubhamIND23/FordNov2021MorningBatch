package com.ford.nov12.morn.functional;

public class FunctionalInterfaceImplementationClass {

    public static void main(String[] args) {

        MyInterface1 inter1 = () ->{
            System.out.println("Welcome to Functional Interfaces...");
        };

        inter1.display1();
        System.out.println("-------------------------------------");

        MyInterface2 inter2 = (int x,int y) ->{
            int result = x +y;
            if(result > 100)
            {
                System.out.println("Result "+result+" Is Acceptable");
            }
            else
            {
                System.out.println("Result "+result+" is Not Acceptable");
            }
        };

        inter2.calculate(20,30);
        inter2.calculate(75,50);
        System.out.println("-------------------------------------");
        Customer c1 = ( int q,int p) -> {
            int invoiceAmt = q * p;
            System.out.println("Invoice AMount is "+invoiceAmt);
        };
        c1.calculateInvoice(20,2000);
        c1.calculateInvoice(40,1500);
        System.out.println("-------------------------------------");
        NewCustomer cust1 = (int qty,int price) -> {
            int totValue = qty * price;
            double finalSaleValue = totValue - (0.1 * totValue);
            return finalSaleValue;
        };
        NewCustomer cust2 = (int qty,int price) -> {
            int totValue = qty * price;
            double finalSaleValue = totValue - (0.2 * totValue);
            return finalSaleValue;
        };
        System.out.println("-------------------------------------");
        SalesData sd1 = (int qty,int price,NewCustomer nc1) -> {
            int actualInvoiceAmt = qty * price;
            System.out.println("Actual Invoice amt for this customer "+actualInvoiceAmt);
            double finalSaleValue = nc1.calculateInvoice(qty,price);
            System.out.println("The Final Discounted Sale value for this Customer  "+finalSaleValue);
        };

        sd1.processOrder(100,250,cust1);
        sd1.processOrder(100,250,cust2);
    }
}
