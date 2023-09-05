package pl.edu.wszib.jwd.onlinestore.web.models;

import java.math.BigDecimal;

public class BicycleModel {
    private long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private String imgUrl;
    private int quantity;



    public BicycleModel(long id, String name, String brand, BigDecimal price, String imgUrl, int quantity) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.imgUrl = imgUrl;
        this.quantity = quantity;

    }

    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public String getBrand() {return brand;}

    public BigDecimal getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public int getQuantity() {
        return quantity;
    }
}
