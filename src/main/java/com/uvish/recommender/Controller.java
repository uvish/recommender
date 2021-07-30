package com.uvish.recommender;

import com.uvish.recommender.dto.Customer;
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
    @GetMapping("/getUser")
    public ResponseEntity<?> getUser(@RequestBody Customer customer) {
        return new ResponseEntity<>(service.getUser(customer.getCustomer_name()),HttpStatus.OK);
    }



}
