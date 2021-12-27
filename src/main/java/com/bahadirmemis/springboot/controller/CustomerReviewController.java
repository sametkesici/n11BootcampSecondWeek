package com.bahadirmemis.springboot.controller;

import com.bahadirmemis.springboot.converter.CustomerReviewConvertor;
import com.bahadirmemis.springboot.dto.CustomerReviewDto;
import com.bahadirmemis.springboot.entity.Customer;
import com.bahadirmemis.springboot.entity.CustomerReview;
import com.bahadirmemis.springboot.service.entityservice.CustomerReviewService;
import com.bahadirmemis.springboot.service.entityservice.CustomerService;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/reviews")
public class CustomerReviewController {

  private final CustomerReviewService customerReviewService;

  private final CustomerReviewConvertor customerReviewConvertor;

  private final CustomerService customerService;

  @GetMapping("/customerId/{customerId}")
  public List<CustomerReviewDto> findCustomerReviewsByCustomerId(@PathVariable UUID customerId){
      return customerReviewConvertor.toDto(customerReviewService.findReviewByCustomerId(customerId));
  }

  @GetMapping("/productId/{productId}")
  public List<CustomerReviewDto> findCustomerReviewByProductId(@PathVariable Long productId){
    return customerReviewConvertor.toDto(customerReviewService.findReviewByProductId(productId));
  }

  @PostMapping("")
  public ResponseEntity<String> saveCustomerReview(@RequestBody CustomerReviewDto customerReviewDto){

    customerService.findCustomerById(customerReviewDto.getCustomerId());

    CustomerReview customerReview = customerReviewConvertor.toEntity(customerReviewDto);
    customerReviewService.saveCustomerReview(customerReview);

    return ResponseEntity.ok("Kullanıcı Yorumu basarıyla kaydedildi");
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteReview(@PathVariable UUID id) {

    customerReviewService.deleteCustomerReview(id);
    return ResponseEntity.ok("Kullanıcı Yorumu Basarıyla Silindi");

  }
}
