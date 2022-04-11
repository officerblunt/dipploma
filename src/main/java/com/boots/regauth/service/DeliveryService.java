package com.boots.regauth.service;

import com.boots.regauth.entity.Delivery;

import java.util.List;

public interface DeliveryService {

    void create(Delivery delivery);

    List<Delivery> readAll();

    Delivery read(long id);

    boolean update(Delivery delivery, long id);

    boolean delete(long id);
}
