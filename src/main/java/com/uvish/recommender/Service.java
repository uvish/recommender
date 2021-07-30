package com.uvish.recommender;

import lombok.AllArgsConstructor;
import org.apache.catalina.User;

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

    public List<UserData> getByProduct(String product){
        return repository.findTop5ByProduct(product);
    }
    
}
