package com.ford.nov12.morn.functional;

public class Supplier {
    String supplierId;
    String supplierName;
    String supplierCity;
    int supplyValue;

    public Supplier() {
    }

    public Supplier(String supplierId, String supplierName, String supplierCity, int supplyValue) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.supplierCity = supplierCity;
        this.supplyValue = supplyValue;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierCity() {
        return supplierCity;
    }

    public void setSupplierCity(String supplierCity) {
        this.supplierCity = supplierCity;
    }

    public int getSupplyValue() {
        return supplyValue;
    }

    public void setSupplyValue(int supplyValue) {
        this.supplyValue = supplyValue;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId='" + supplierId + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", supplierCity='" + supplierCity + '\'' +
                ", supplyValue=" + supplyValue +
                '}';
    }
}
