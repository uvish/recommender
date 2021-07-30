package com.uvish.recommender;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Repository extends JpaRepository<UserData,Long> {
    List<UserData> findByCustomerName(String customer);
    List<UserData> findTop5ByProduct(String product);
}
