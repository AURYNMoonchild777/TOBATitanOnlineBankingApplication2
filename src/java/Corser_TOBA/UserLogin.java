
package Corser_TOBA;


import java.io.Serializable;


public class UserLogin implements Serializable {
    
    
    
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String email;
    
    public boolean valid;
    
    private UserLogin() {
   
        firstName = "";
        lastName = "";
        username = "";
        password = "";
        phoneNumber = "";
        address = "";
        city = "";
        state = "";
        zipCode = "";
        email = "";
                
    }
    
    public UserLogin (String firstName, String lastName, String username, String password, String phoneNumber, String address, String city, String state, String zipCode, String email) {

    
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.password = password;
    this.phoneNumber = phoneNumber;
    this.address = address;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
    this.email = email;

    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername (String username) {
        this.username = username;
    }
    
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword (String password) {
        this.password = password;
    }
    
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }
    
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress (String address) {
        this.address = address;
    }
    
    
    public String getCity() {
        return city;
    }
    
    public void setCity (String city) {
        this.city = city;
    }
    
        
    public String getState() {
        return state;
    }
    
    public void setState (String state) {
        this.state = state;
    }
    
               
    public String getZipCode() {
        return zipCode;
    }
    
    public void setZipCode (String zipCode) {
        this.zipCode = zipCode;
    }
    
        
    public String getEmail() {
        return email;
    }
    
    public void setEmail (String email) {
        this.email = email;
    }
   
    
}

