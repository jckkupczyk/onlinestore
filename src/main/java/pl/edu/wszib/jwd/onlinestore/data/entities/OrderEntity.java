package pl.edu.wszib.jwd.onlinestore.data.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "orders")
public class OrderEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "brand")
    private String bicycleBrand;
    @Column(name = "name")
    private String bicycleName;
    @Column(name = "price")
    private BigDecimal price;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_address_id")
    private OrderAddressEntity orderAddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBicycleName() {
        return bicycleName;
    }

    public void setBicycleName(String bicycleName) {
        this.bicycleName = bicycleName;
    }

    public String getBicycleBrand() {
        return bicycleBrand;
    }

    public void setBicycleBrand(String bicycleBrand) {
        this.bicycleBrand = bicycleBrand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public OrderAddressEntity getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(OrderAddressEntity orderAddress) {
        this.orderAddress = orderAddress;
    }
}
