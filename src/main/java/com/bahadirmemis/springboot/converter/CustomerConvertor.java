package com.bahadirmemis.springboot.converter;

import com.bahadirmemis.springboot.dto.CustomerDto;
import com.bahadirmemis.springboot.entity.Customer;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerConvertor extends BaseConvertor<Customer,CustomerDto> {

  CustomerDto toDto(Customer customer);

  Customer toEntity(CustomerDto customerDto);

  List<Customer> toEntity(List<CustomerDto> dtoList);

  List<CustomerDto> toDto(List<Customer> entityList);

}
