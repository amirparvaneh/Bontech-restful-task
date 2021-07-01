package com.bontech.restful.service;

import com.bontech.restful.model.Client;

import java.util.List;

public interface Service {
    public List<Client> findAll();

    public Client findById(int theId);

    public void save(Client theEmployee);

    public void deleteById(int theId);
}
