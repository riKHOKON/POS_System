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
public class Item {
    
    private int id, qty,availableQty;
    private float sellingPrice, buyingPrice, totalPrice;
    private String name;

    public Item() {
    }
    
    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getQty() {
        return qty;
    }

    public int getAvailableQty() {
        return availableQty;
    }
    
    public float getSellingPrice() {
        return sellingPrice;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public String getName() {
        return name;
    }

    public float getBuyingPrice() {
        return buyingPrice;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setAvailableQty(int availableQty) {
        this.availableQty = availableQty;
    }
    
    public void setSellingPrice(float sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public void setTotalPrice(float sPrice, int q) {
        this.totalPrice = sPrice * (float)q;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBuyingPrice(float buyingPrice) {
        this.buyingPrice = buyingPrice;
    }
    
    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", qty=" + qty + ", sellingPrice=" + sellingPrice + ", totalPrice=" + totalPrice + ", name=" + name + '}';
    }
    
    
}
