/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.management.application.model;

import java.util.Objects;

/**
 *
 * @author rIslam
 */
public class Pawna {
    private int id,itemId;
    private String name,date,form_whoom,status;
    private double unitPrice,totalPrice;

    public Pawna(int id, int itemId, String name, String date, String form_whoom, String status, double unitPrice, double totalPrice) {
        this.id = id;
        this.itemId = itemId;
        this.name = name;
        this.date = date;
        this.form_whoom = form_whoom;
        this.status = status;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }

    public Pawna(int id, double unitPrice, double totalPrice) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
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

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pawna other = (Pawna) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.itemId != other.itemId) {
            return false;
        }
        if (Double.doubleToLongBits(this.unitPrice) != Double.doubleToLongBits(other.unitPrice)) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalPrice) != Double.doubleToLongBits(other.totalPrice)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.form_whoom, other.form_whoom)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pawna{" + "id=" + id + ", itemId=" + itemId + ", name=" + name + ", date=" + date + ", form_whoom=" + form_whoom + ", status=" + status + ", unitPrice=" + unitPrice + ", totalPrice=" + totalPrice + '}';
    }

        
}
