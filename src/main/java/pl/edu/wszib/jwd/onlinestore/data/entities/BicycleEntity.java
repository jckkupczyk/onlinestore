package pl.edu.wszib.jwd.onlinestore.data.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "bicycles")
public class BicycleEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;


    @Column(name = "brand")
    private String brand;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "imgUrl")
    private String imgUrl;

    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "color")
    private String color;

    @Column(name = "weight")
    private float weight;

    @Column(name = "frameSize")
    private int frameSize;

    @Column(name = "wheelSize")
    private float wheelSize;

    @Column(name = "numberOfGears")
    private int numberOfGears;

    @Column(name = "specificationUrl")
    private String specificationUrl;


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

    public float getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(float wheelSize) {
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
