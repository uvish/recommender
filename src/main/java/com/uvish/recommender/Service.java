package com.uvish.recommender;

import lombok.AllArgsConstructor;

import javax.transaction.Transactional;
import java.util.List;

@org.springframework.stereotype.Service
@AllArgsConstructor
@Transactional
public class Service {
    Repository repository;
    public List<UserData> getUser(String customer_name){
    return repository.findByCustomerName(customer_name);
    }
}
