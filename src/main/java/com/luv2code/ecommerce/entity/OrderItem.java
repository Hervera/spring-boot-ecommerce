package com.luv2code.ecommerce.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "order_item")
@Getter
@Setter
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="imageUrl")
    private String imageUrl;

    @Column(name="unitPrice")
    private BigDecimal unitPrice;

    @Column(name="quantity")
    private int Quantity;

    @Column(name="product_id")
    private Long productId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
