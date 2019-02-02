package main.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int order_id;

    @Column(name = "address_from")
    @JsonProperty("address_from")
    private String addressFrom;

    @Column(name = "zip_from")
    @JsonProperty("zip_from")
    private int zipFrom;

    @Column(name = "city_from")
    @JsonProperty("city_from")
    private String cityFrom;

    @Column(name = "address_to")
    @JsonProperty("address_to")
    private String addressTo;

    @Column(name = "zip_to")
    @JsonProperty("zip_to")
    private int zipTo;

    @Column(name = "city_to")
    @JsonProperty("city_to")
    private String cityTo;

    @Column(name = "date")
    @JsonProperty("date")
    private String date;

    @Column(name = "description")
    @JsonProperty("description")
    private String description;


    public OrderDetail() {
    }

    public OrderDetail(String addressFrom, int zipFrom, String cityFrom, String addressTo, int zipTo, String cityTo, String date, String description) {
        this.addressFrom = addressFrom;
        this.zipFrom = zipFrom;
        this.cityFrom = cityFrom;
        this.addressTo = addressTo;
        this.zipTo = zipTo;
        this.cityTo = cityTo;
        this.date = date;
        this.description = description;
    }


    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getAddressFrom() {
        return addressFrom;
    }

    public void setAddressFrom(String addressFrom) {
        this.addressFrom = addressFrom;
    }

    public int getZipFrom() {
        return zipFrom;
    }

    public void setZipFrom(int zipFrom) {
        this.zipFrom = zipFrom;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    public String getAddressTo() {
        return addressTo;
    }

    public void setAddressTo(String addressTo) {
        this.addressTo = addressTo;
    }

    public int getZipTo() {
        return zipTo;
    }

    public void setZipTo(int zipTo) {
        this.zipTo = zipTo;
    }

    public String getCityTo() {
        return cityTo;
    }

    public void setCityTo(String cityTo) {
        this.cityTo = cityTo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
