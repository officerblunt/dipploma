package com.boots.regauth.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "t_delivery")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_id")
    private long id;
    private int amountOfSpaces;
    private String organisation;
}
