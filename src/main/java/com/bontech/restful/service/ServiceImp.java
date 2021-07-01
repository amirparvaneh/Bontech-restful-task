package com.bontech.restful.service;


import com.bontech.restful.model.Client;
import com.bontech.restful.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceImp implements com.bontech.restful.service.Service {

    private Repo repo ;

    @Autowired
    public ServiceImp(Repo clientRepo){
        this.repo = clientRepo;
    }

    @Override
    public List<Client> findAll() {
        return repo.findAll();
    }

    @Override
    public Client findById(int theId) {
        Optional<Client> result = repo.findById(theId);
        Client theClient = null;
        if (result.isPresent()){
            theClient = result.get();
        }else
            throw new RuntimeException("did not find Client_ID");
        return theClient;
    }

    @Override
    public void save(Client theEmployee) {
        repo.save(theEmployee);
    }

    @Override
    public void deleteById(int theId) {
        repo.deleteById(theId);
    }
}
