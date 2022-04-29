package com.boots.regauth.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.swing.*;
import java.awt.*;
import java.util.Date;

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
    private String date;
    private String time;
    private String address;
    private String phone;
    private String clientName;
    private int amountOfSpaces;
    private String organisation;
    private String status;
    private String type;
    private double weight;
    private String marks;
    /*private Bytea photo;*/
}
