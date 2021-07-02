package com.bontech.restful;

import com.bontech.restful.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfulApplication {

    public static void main(String[] args) { SpringApplication.run(RestfulApplication.class, args);
        Client ali = new Client(1,"ali",12133,2345678);

    }
}
