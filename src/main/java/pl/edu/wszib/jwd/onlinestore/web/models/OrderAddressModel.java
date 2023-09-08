package pl.edu.wszib.jwd.onlinestore.web.models;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class OrderAddressModel {
    @Size(min = 2, max = 30)
    private String firstName;
    @Size(min = 2, max = 30)
    private String lastName;
    @Size(min = 2, max = 30)
    private String street;
    @Size(min = 6, max = 6)
    @Pattern(regexp = "[0-9]{2}-[0-9]{3}")
    private String postalCode;
    @Size(min = 1, max = 4)
    private String houseNumber;
    @Size(max = 4)
    private String apartmentNumber;
    @Size(min = 2, max = 30)
    private String city;

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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
}