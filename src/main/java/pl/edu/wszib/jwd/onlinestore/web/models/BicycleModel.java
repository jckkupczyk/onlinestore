package pl.edu.wszib.jwd.onlinestore.web.models;

import java.math.BigDecimal;

public class BicycleModel {
    private long id;
    private String name;
    private BigDecimal price;
    private String color;

    public BicycleModel(long id, String name, BigDecimal price, String color) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}
