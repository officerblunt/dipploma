package com.boots.regauth.service;

import com.boots.regauth.entity.Client;

import java.util.List;

public interface ClientService {

    void create(Client client);

    List<Client> readAll();

    Client read(long id);

    boolean update(Client client, long id);

    boolean delete(long id);
}
