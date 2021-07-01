package com.bontech.restful.repository;

import com.bontech.restful.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Repo extends JpaRepository<Client,Integer>{

}
