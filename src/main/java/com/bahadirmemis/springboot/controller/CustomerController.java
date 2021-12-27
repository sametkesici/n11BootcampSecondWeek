package com.bahadirmemis.springboot.controller;

import com.bahadirmemis.springboot.converter.CustomerConvertor;
import com.bahadirmemis.springboot.converter.CustomerRegisterConvertor;
import com.bahadirmemis.springboot.dto.CustomerDto;
import com.bahadirmemis.springboot.dto.CustomerRegisterDto;
import com.bahadirmemis.springboot.entity.Customer;
import com.bahadirmemis.springboot.service.entityservice.CustomerService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class CustomerController {

  private final CustomerService customerService;

  private final CustomerConvertor customerConvertor;

  private final CustomerRegisterConvertor customerRegisterConvertor;

  @GetMapping("")
  public List<CustomerDto> findAllCustomers(){
    return customerConvertor.toDto(customerService.findAllCustomers());
  }

  @GetMapping("/username/{userName}")
  public CustomerDto findCustomerByUserName(@PathVariable String userName){
    return customerConvertor.toDto(customerService.findCustomerByUserName(userName));
  }

  @GetMapping("/phonenumber/{phoneNumber}")
  public CustomerDto findCustomerByPhoneNumber(@PathVariable String phoneNumber){
    return customerConvertor.toDto(customerService.findCustomerByPhoneNumber(phoneNumber));
  }

  @PostMapping("")
  public CustomerDto saveCustomer(@RequestBody CustomerRegisterDto customerRegisterDto){
     return customerConvertor.toDto(customerService.saveCustomer(customerRegisterConvertor.toEntity(customerRegisterDto)));
  }

  @DeleteMapping("/{userName}/{phoneNumber}")
  public ResponseEntity<String> deleteCustomer(@PathVariable String userName , @PathVariable  String phoneNumber)  {
      customerService.deleteCustomer(userName,phoneNumber);
      return ResponseEntity.ok("kullanıcı silindi");
  }

  @PutMapping("/{id}")
  public ResponseEntity<String> updateCustomer(@RequestBody CustomerDto customerDto){
      customerService.findCustomerById(customerDto.getId());
      customerService.updateCustomer(customerConvertor.toEntity(customerDto));
      return ResponseEntity.ok("Kullanıcı başarıyla güncellendi");
  }
}
