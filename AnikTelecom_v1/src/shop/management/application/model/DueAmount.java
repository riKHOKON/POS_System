/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.management.application.model;

/**
 *
 * @author rIslam
 */
public class DueAmount {
    private int id;
    private String items, quantity,date,customerName,customerPhone,soldBy,paymentStatus,paymentDeadLine; 
    private double totalCost,paidAmount,dueAmount;

    public DueAmount(int id, String items, String quantity, String date, String customerName, String customerPhone, String soldBy, String paymentStatus, String paymentDeadLine, double totalCost, double paidAmount, double dueAmount) {
        this.id = id;
        this.items = items;
        this.quantity = quantity;
        this.date = date;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.soldBy = soldBy;
        this.paymentStatus = paymentStatus;
        this.paymentDeadLine = paymentDeadLine;
        this.totalCost = totalCost;
        this.paidAmount = paidAmount;
        this.dueAmount = dueAmount;
    }

    public DueAmount(int aInt, double aDouble) {
        this.id = aInt;
        this.dueAmount= aDouble;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getSoldBy() {
        return soldBy;
    }

    public void setSoldBy(String soldBy) {
        this.soldBy = soldBy;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentDeadLine() {
        return paymentDeadLine;
    }

    public void setPaymentDeadLine(String paymentDeadLine) {
        this.paymentDeadLine = paymentDeadLine;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public double getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(double dueAmount) {
        this.dueAmount = dueAmount;
    }

    @Override
    public String toString() {
        return "DueAmount{" + "id=" + id + ", items=" + items + ", quantity=" + quantity + ", date=" + date + ", customerName=" + customerName + ", customerPhone=" + customerPhone + ", soldBy=" + soldBy + ", paymentStatus=" + paymentStatus + ", paymentDeadLine=" + paymentDeadLine + ", totalCost=" + totalCost + ", paidAmount=" + paidAmount + ", dueAmount=" + dueAmount + '}';
    }
    
    
    
    
}
