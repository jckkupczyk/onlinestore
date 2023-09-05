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
    private int quantity;

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
