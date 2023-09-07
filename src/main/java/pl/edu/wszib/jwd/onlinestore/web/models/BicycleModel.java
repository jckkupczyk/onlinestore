package pl.edu.wszib.jwd.onlinestore.web.models;

import jakarta.validation.constraints.Min;

import java.math.BigDecimal;

public class BicycleModel {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private String imgUrl;
    @Min(1)
    private Long quantity;

    public BicycleModel() {
    }

    public BicycleModel(Long id, String name, String brand, BigDecimal price, String imgUrl, Long quantity) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.imgUrl = imgUrl;
        this.quantity = quantity;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}





