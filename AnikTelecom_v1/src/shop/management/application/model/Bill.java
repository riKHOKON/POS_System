/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.management.application.model;

import java.util.ArrayList;

/**
 *
 * @author rIslam
 */
public  class Bill {
      
    private int billId;
    private String items;
    private String prices;
    private String quantities;
    private String soldBy;
    private float netProfit;
    private String customerName;
    private String customerPhone;
    private final ArrayList<Item> billItems;
    private float grandTotal;
    private String date;
    
    
    public Bill() {
        billItems = new ArrayList<>();
    }

    public Bill(int billId, String items, String prices, String quantities, String soldBy, float netProfit, String customerName, String customerPhone, float grandTotal, String date) {
        this.billId = billId;
        this.items = items;
        this.prices = prices;
        this.quantities = quantities;
        this.soldBy = soldBy;
        this.netProfit = netProfit;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.grandTotal = grandTotal;
        this.date = date;
        billItems = new ArrayList<>();
    }
    
    public void addItemToBillItems(Item i){
            
            billItems.add(i);  
    }   
    public ArrayList<Item> getBillItems(){
        return billItems;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getBillId() {
        return billId;
    }
    
    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public String getDate() {
        return date;
    }
    public void setGrandTotal(){
        if (billItems.isEmpty()) {
            grandTotal = 0;
        }else{
            for (int i = 0; i < billItems.size(); i++) {
                grandTotal += billItems.get(i).getTotalPrice();
            }
        }
    }
    public float getGrandTotal(){
        return grandTotal;
    }
    public void removeItemFromBill(int index){
	billItems.remove(index);
    }
    public void removeAllItemsFromBill(){
        billItems.removeAll(billItems);    
    }

    public String getItems() {
        return items;
    }

    public String getPrices() {
        return prices;
    }

    public String getQuantities() {
        return quantities;
    }

    public String getSoldBy() {
        return soldBy;
    }

    public float getNetProfit() {
        return netProfit;
    }
    
}
