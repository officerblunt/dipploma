package com.boots.regauth.service;

import com.boots.regauth.entity.Client;
import com.boots.regauth.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void create(Client client) {
        clientRepository.save(client);
    }

    @Override
    public List<Client> readAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client read(long id) {
        return clientRepository.getOne(id);
    }

    @Override
    public boolean update(Client client, long id) {
        if (clientRepository.existsById(id)) {
            client.setId(id);
            clientRepository.save(client);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(long id) {
        if (clientRepository.existsById(id)) {
            clientRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
