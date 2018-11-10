
package shop.management.application.model;



/**
 *
 * @author rIslam
 */
public class Product {
    
    private int id,qty;
    private String name,company,category,description,supplier;
    private String jDate;
    private float buyingPrice;
    private byte [] picture; 

    public Product(int id, String name, String category, String company, float purchaseCost, int quantity, String date, byte[] img, String supplier, String description) {
        //throw new UnsupportedOperationException("Not supported yet.");
        this.id = id;
        this.name = name;
        this.category = category;
        this.company = company;
        this.buyingPrice = purchaseCost;
        this.qty = quantity;
        this.jDate = date;
        this.picture = img;
        this.supplier = supplier;
        this.description = description;
        
    }

    public Product(int id, int qty, float buyingPrice) {
        this.id = id;
        this.qty = qty;
        this.buyingPrice = buyingPrice;
    }
    

//    public Product(int id, int qty, String name, String company, String category, String description, String supplier, String jDate, float buyingPrice, byte[] picture) {
//        this.id = id;
//        this.qty = qty;
//        this.name = name;
//        this.company = company;
//        this.category = category;
//        this.description = description;
//        this.supplier = supplier;
//        this.jDate = jDate;
//        this.buyingPrice = buyingPrice;
//        this.picture = picture;
//    }

    public int getId() {
        return id;
    }

    public int getQty() {
        return qty;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getSupplier() {
        return supplier;
    }

    public String getjDate() {
        return jDate;
    }

    public float getBuyingPrice() {
        return buyingPrice;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public void setjDate(String jDate) {
        this.jDate = jDate;
    }

    public void setBuyingPrice(float buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
