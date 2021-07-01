package com.bontech.restful.controller;

import com.bontech.restful.model.Client;
import com.bontech.restful.service.ServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api")
public class Controller {

    private ServiceImp serviceImp ;

    @Autowired
    public Controller(ServiceImp serviceImp){
        this.serviceImp = serviceImp;
    }
    @GetMapping("/allclient")
    public List<Client> getAllClient(){
        return serviceImp.findAll();
    }
    @GetMapping("/client/{id}")
    public Client findById(@PathVariable int id){
       Client result =  serviceImp.findById(id);
       if (result == null){
           throw new RuntimeException("the id not found"+ id);
       }
       return result;
    }
    @PostMapping(value = "/save",consumes = "application/json")
    public void addClient(@RequestBody Client client){
        serviceImp.save(client);
    }


    @DeleteMapping("/client/{id}")
    public String deleteClient(@PathVariable int id) {

        Client result = serviceImp.findById(id);

        // throw exception if null

        if (result == null) {
            throw new RuntimeException("Client id not found - " + id);
        }

        serviceImp.deleteById(id);

        return "Deleted client id - " + id;
    }
}
