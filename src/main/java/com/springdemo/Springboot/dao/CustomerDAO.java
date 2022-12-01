package com.springdemo.Springboot.dao;

import com.springdemo.Springboot.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDAO extends CrudRepository<Customer, Integer> {
@Override
    List<Customer> findAll();
}
