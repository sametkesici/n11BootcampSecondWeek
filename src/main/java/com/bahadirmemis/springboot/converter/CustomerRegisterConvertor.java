package com.bahadirmemis.springboot.converter;


import com.bahadirmemis.springboot.dto.CustomerRegisterDto;
import com.bahadirmemis.springboot.entity.Customer;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerRegisterConvertor extends BaseConvertor<Customer , CustomerRegisterDto> {

  CustomerRegisterDto toDto(Customer customer);

  Customer toEntity(CustomerRegisterDto customerRegisterDto);

  List<Customer> toEntity(List<CustomerRegisterDto> dtoList);

  List<CustomerRegisterDto> toDto(List<Customer> entityList);

}
