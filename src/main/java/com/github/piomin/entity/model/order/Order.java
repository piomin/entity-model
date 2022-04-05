package com.github.piomin.entity.model.order;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private Integer customerId;
    private Integer productId;
    private int amount;
    private int productsCount;
    @Enumerated
    private OrderStatus status = OrderStatus.NEW;
    private String source;
    private String rejectedService;
}
