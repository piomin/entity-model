package com.github.piomin.entity.model.customer;

import lombok.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int amountAvailable;
    private int amountReserved;
}
