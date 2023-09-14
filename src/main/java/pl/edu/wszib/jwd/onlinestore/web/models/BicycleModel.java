package pl.edu.wszib.jwd.onlinestore.web.models;

import jakarta.validation.constraints.Min;

import java.math.BigDecimal;

public class BicycleModel {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private String imgUrl;
    @Min(0)
    private Long quantity;
    private String color;
    @Min(1)
    private float weight;
    @Min(1)
    private int frameSize;
    @Min(1)
    private int wheelSize;
    @Min(1)
    private int numberOfGears;
    private String specificationUrl;

    public BicycleModel() {
    }

    public BicycleModel(Long id, String name, String brand, BigDecimal price, String imgUrl, Long quantity, String color, float weight, int frameSize, int wheelSize, int numberOfGears, String specificationUrl) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.imgUrl = imgUrl;
        this.quantity = quantity;
        this.color = color;
        this.weight = weight;
        this.frameSize = frameSize;
        this.wheelSize = wheelSize;
        this.numberOfGears = numberOfGears;
        this.specificationUrl = specificationUrl;

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(int frameSize) {
        this.frameSize = frameSize;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public String getSpecificationUrl() {
        return specificationUrl;
    }

    public void setSpecificationUrl(String specificationUrl) {
        this.specificationUrl = specificationUrl;
    }
}





