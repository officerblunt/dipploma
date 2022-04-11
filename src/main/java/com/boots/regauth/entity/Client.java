package com.boots.regauth.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "t_clients")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private long id;
    private String firstName;
    private String lastName;
    private String phone;
    private String organisation;
    private String address;
    //@OneToMany(mappedBy = "client")
    //private List<Document> docs;
}

