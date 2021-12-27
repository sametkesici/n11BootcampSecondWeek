package com.bahadirmemis.springboot.service.entityservice;

import com.bahadirmemis.springboot.dao.CustomerReviewDao;
import com.bahadirmemis.springboot.entity.CustomerReview;
import com.bahadirmemis.springboot.exception.ReviewNotFoundException;
import java.util.List;
import java.util.UUID;
import javax.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerReviewService {

  private final CustomerReviewDao customerReviewDao;

  private final UrunEntityService productService;

  private final CustomerService customerService;


  public List<CustomerReview> findReviewByCustomerId(UUID customerId)  {

    List<CustomerReview> reviewsByUserId = customerReviewDao.findByCustomerId(customerId);

    String customerName = customerService.findCustomerById(customerId).getName();

    if(reviewsByUserId.isEmpty()){
      throw new ReviewNotFoundException(customerName + " adlı kullanici henuz bir yorum yazmamistir.");
    }else{
      return reviewsByUserId;
    }
  }

  public List<CustomerReview> findReviewByProductId(Long productId)  {
      List<CustomerReview> reviewsByProductId = customerReviewDao.findByProductId(productId);
      String productName = productService.findById(productId).getAdi();

      if(reviewsByProductId.isEmpty()){
        throw new ReviewNotFoundException(productName + " adli urune henuz bir yorum yazilmamistir");
      }else{
        return reviewsByProductId;
      }
  }

  public void saveCustomerReview(CustomerReview customerReview){
      customerService.findCustomerById(customerReview.getCustomer().getId());
      customerReviewDao.save(customerReview);
  }


  public void deleteCustomerReview(UUID customerReviewId){
    customerReviewDao.findById(customerReviewId).orElseThrow(() -> new EntityNotFoundException(customerReviewId + " bu id ile bir kullanıcı yorumu bulanamamıstir."));
    customerReviewDao.deleteById(customerReviewId);
  }


}
