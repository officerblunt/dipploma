package com.boots.regauth.service;

import com.boots.regauth.entity.Delivery;
import com.boots.regauth.repository.DeliveryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryServiceImpl implements DeliveryService{

    private final DeliveryRepository deliveryRepository;

    public DeliveryServiceImpl(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    @Override
    public void create(Delivery delivery) {
        deliveryRepository.save(delivery);
    }

    @Override
    public List<Delivery> readAll() {
        return deliveryRepository.findAll();
    }

    @Override
    public Delivery read(long id) {
        return deliveryRepository.getOne(id);
    }

    @Override
    public boolean update(Delivery delivery, long id) {
        if (deliveryRepository.existsById(id)) {
            delivery.setId(id);
            deliveryRepository.save(delivery);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(long id) {
        if (deliveryRepository.existsById(id)) {
            deliveryRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
