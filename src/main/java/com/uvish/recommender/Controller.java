package com.uvish.recommender;

import com.uvish.recommender.dto.Customer;
import com.uvish.recommender.dto.Product;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin()
public class Controller {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(Controller.class);
    DataService service;

    public Controller(DataService service) {
        this.service = service;
    }

    @PostMapping("/getUser")
    public ResponseEntity<?> getUser(@RequestBody Customer customer) {
        return new ResponseEntity<>(service.getUser(customer.getCustomer_name()),HttpStatus.OK);
    }

    @PostMapping("/getByPro")
    public ResponseEntity<?> getProduct(@RequestBody Product product) {
        return new ResponseEntity<>(service.getByProduct(product.getProduct()),HttpStatus.OK);
    }




}
