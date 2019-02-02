package main.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "service")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int service_id;

    @Column(name = "type")
    @JsonProperty("type")
    private String type;

    @Column(name = "description")
    @JsonProperty("description")
    private String description;


    public Service(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public Service() {

    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
