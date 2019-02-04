package main.Model;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

//Data model to hold an Customer data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customer_id;

    @Column(name = "first_name")
    @JsonProperty("first_name")
    private String firstName;

    @Column(name = "last_name")
    @JsonProperty("last_name")
    private String lasttName;

    @Column(name = "phone_number")
    @JsonProperty("phone_number")
    private String phoneNumber;

    @Column(name = "email")
    @JsonProperty("email")
    private String email;

    public Customer() {
    }


    public Customer(String firstName, String lasttName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }


    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
