package com.uvish.recommender;

import com.uvish.recommender.dto.Customer;
import com.uvish.recommender.dto.Product;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api")
@AllArgsConstructor
@CrossOrigin()
public class Controller {
    Service service;
    @PostMapping("/getUser")
    public ResponseEntity<?> getUser(@RequestBody Customer customer) {
        return new ResponseEntity<>(service.getUser(customer.getCustomer_name()),HttpStatus.OK);
    }

    @PostMapping("/getByProduct")
    public ResponseEntity<?> getProduct(@RequestBody Product product) {
        return new ResponseEntity<>(service.getByProduct(product.getProduct()),HttpStatus.OK);
    }




}
