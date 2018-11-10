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
public class Expense {
    
    private int expenseId;
    private String expenseTitle;
    private String description;
    private String date;
    private float amount;
    private String expensedBy;

    public Expense(int expenseId,String expenseTitle, String description, String date, float amount, String expensedBy) {
        this.expenseId = expenseId;
        this.expenseTitle = expenseTitle;
        this.description = description;
        this.date = date;
        this.amount = amount;
        this.expensedBy = expensedBy;
    }

    public int getExpenseId() {
        return expenseId;
    }

    public String getExpenseTitle() {
        return expenseTitle;
    }

    public void setExpenseTitle(String expenseTitle) {
        this.expenseTitle = expenseTitle;
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

    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
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
        return "Expense{" + "expenseId=" + expenseId + ", ExpenseTitle=" + expenseTitle +", description=" + description + ", date=" + date + ", amount=" + amount + ", expensedBy=" + expensedBy + '}';
    }
    
    

}
