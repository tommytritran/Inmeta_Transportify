package main.Model;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

//Data model to hold an Sales employee data

@Entity
@Table(name = "sales_employee")
public class SalesEmployee {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int employee_id;


    @Column(name = "first_name")
    @JsonProperty("first_name")
    private String firstName;

    @Column(name = "last_name")
    @JsonProperty("last_name")
    private String lastName;

    public SalesEmployee() {
    }

    public SalesEmployee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
