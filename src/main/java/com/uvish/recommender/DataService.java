package com.uvish.recommender;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DataService {
    Repository repository;

    public DataService(Repository repository) {
        this.repository = repository;
    }

    public List<UserData> getUser(String customer_name){
    return repository.findByCustomerName(customer_name);
    }

    public List<UserData> getByProduct(String product){
        return repository.findTop5ByProduct(product);
    }
    
}
