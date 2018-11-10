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
public class MalKroyExpense {
    private int malKroyId;
    private String description;
    private String date;
    private float amount;
    private String expensedBy;

    public MalKroyExpense(int malKroyId, String description, String date, float amount, String expensedBy) {
        this.malKroyId = malKroyId;
        this.description = description;
        this.date = date;
        this.amount = amount;
        this.expensedBy = expensedBy;
    }

    public int getMalKroyId() {
        return malKroyId;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public float getAmount() {
        return amount;
    }

    public String getExpensedBy() {
        return expensedBy;
    }

    public void setMalKroyId(int malKroyId) {
        this.malKroyId = malKroyId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setExpensedBy(String expensedBy) {
        this.expensedBy = expensedBy;
    }

    @Override
    public String toString() {
        return "MalKroyExpense{" + "malKroyId=" + malKroyId + ", description=" + description + ", date=" + date + ", amount=" + amount + ", expensedBy=" + expensedBy + '}';
    }
    
    
    
}
