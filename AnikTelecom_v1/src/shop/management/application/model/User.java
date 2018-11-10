
package shop.management.application.model;



/**
 *
 * @author rIslam
 */
public class User {
    
    private int userId;
    private String fristName,lastName,userType,email,phone,address,password;
    private String jDate;
    private float salary;
    private byte [] picture;
    private String paymentStatus;
    private String paymentDate;
    private float paidSalary;
    private String userName;

    public User() {
    }

    
    public User(int userId, String fristName, String lastName, String userType, String email, String phone, String address, String jDate, float salary,byte []pimg,String password) {
        this.userId = userId;
        this.fristName = fristName;
        this.lastName = lastName;
        this.userType = userType;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.jDate = jDate;
        this.salary = salary;
        this.picture = pimg;
        this.password = password;
    }

    public User(int userId, String fristName, String lastName, String userType, String email, String phone, String address, String password, String jDate, float salary, byte[] picture, String paymentStatus, String paymentDate, float paidSalary, String userName) {
        this.userId = userId;
        this.fristName = fristName;
        this.lastName = lastName;
        this.userType = userType;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.password = password;
        this.jDate = jDate;
        this.salary = salary;
        this.picture = picture;
        this.paymentStatus = paymentStatus;
        this.paymentDate = paymentDate;
        this.paidSalary = paidSalary;
        this.userName = userName;
    }

    
    public int getUserId() {
        return userId;
    }

    public String getFristName() {
        return fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserType() {
        return userType;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getjDate() {
        return jDate;
    }

    public float getSalary() {
        return salary;
    }

    public byte[] getPicture() {
        return picture;
    }

    public String getPassword() {
        return password;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public float getPaidSalary() {
        return paidSalary;
    }

    public String getUserName() {
        return userName;
    }
    

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setjDate(String jDate) {
        this.jDate = jDate;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public void setPassword(String password) {
        this.password = password;
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
