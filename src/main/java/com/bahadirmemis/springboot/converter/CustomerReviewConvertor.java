package com.bahadirmemis.springboot.converter;

import com.bahadirmemis.springboot.dto.CustomerReviewDto;
import com.bahadirmemis.springboot.entity.CustomerReview;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerReviewConvertor extends BaseConvertor<CustomerReview,CustomerReviewDto> {

  @Mapping(source = "customer.id" , target = "customerId")
  @Mapping(source = "product.id" , target = "productId")
  CustomerReviewDto toDto(CustomerReview customer);

  @Mapping(source = "customerId" , target = "customer.id")
  @Mapping(source = "productId" , target = "product.id")
  CustomerReview toEntity(CustomerReviewDto customerReviewDto);

  @Mapping(source = "customerId" , target = "customer.id")
  @Mapping(source = "productId" , target = "product.id")
  List<CustomerReview> toEntity(List<CustomerReviewDto> dtoList);

  @Mapping(source = "customer.id" , target = "customerId")
  @Mapping(source = "product.id" , target = "productId")
  List<CustomerReviewDto> toDto(List<CustomerReview> entityList);


}
