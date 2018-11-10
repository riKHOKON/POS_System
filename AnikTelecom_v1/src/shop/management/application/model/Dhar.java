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
public class Dhar {
    private int id,itemId;
    private String name,date,form_whoom,status;
    private double unitPrice,totalPrice;

    public Dhar(int id, int itemId, String name, String date, String form_whoom, String status, double unitPrice, double totalPrice) {
        this.id = id;
        this.itemId = itemId;
        this.name = name;
        this.date = date;
        this.form_whoom = form_whoom;
        this.status = status;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }

    public Dhar(int aInt, double d, double dd) {
        this.id= aInt;
        this.unitPrice = d;
        this.totalPrice = dd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getForm_whoom() {
        return form_whoom;
    }

    public void setForm_whoom(String form_whoom) {
        this.form_whoom = form_whoom;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    
    
}
