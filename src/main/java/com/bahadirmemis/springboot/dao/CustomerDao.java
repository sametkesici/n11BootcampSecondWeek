package com.bahadirmemis.springboot.dao;

import com.bahadirmemis.springboot.entity.Customer;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends JpaRepository<Customer, UUID> {

  Optional<Customer> findByUserName(String userName);

  Optional<Customer> findByPhoneNumber(String phoneNumber);

}
