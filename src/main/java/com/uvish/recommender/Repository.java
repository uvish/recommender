package com.uvish.recommender;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Repository extends JpaRepository<UserData,Long> {
    List<UserData> findByCustomerName(String customer);
}
