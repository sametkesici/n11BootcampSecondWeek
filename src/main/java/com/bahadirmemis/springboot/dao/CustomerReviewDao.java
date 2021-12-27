package com.bahadirmemis.springboot.dao;

import com.bahadirmemis.springboot.entity.CustomerReview;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerReviewDao extends JpaRepository<CustomerReview, UUID> {

  public List<CustomerReview> findByCustomerId(UUID customerId);

  public List<CustomerReview> findByProductId(Long productId);

}
