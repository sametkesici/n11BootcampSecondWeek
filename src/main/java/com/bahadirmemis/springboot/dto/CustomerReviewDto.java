package com.bahadirmemis.springboot.dto;

import java.util.Date;
import java.util.UUID;
import lombok.Data;

@Data
public class CustomerReviewDto {

  private UUID id;

  private String review;

  private Date reviewDate;

  private UUID customerId;

  private Long productId;

}
