package com.bahadirmemis.springboot.service.entityservice;

import com.bahadirmemis.springboot.dao.CustomerDao;
import com.bahadirmemis.springboot.entity.Customer;
import com.bahadirmemis.springboot.exception.UserNameAndPhoneNumberIsNotMatchException;
import java.util.List;
import java.util.UUID;
import javax.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

  private final CustomerDao customerDao;


  public List<Customer> findAllCustomers() {
    return customerDao.findAll();
  }

  public Customer findCustomerByUserName(String userName){
    return customerDao.findByUserName(userName).orElseThrow(() -> new EntityNotFoundException(userName + " kullanıcı adına ait kayıt bulanamadi"));
  }

  public Customer findCustomerById(UUID id){

    return  customerDao.findById(id).orElseThrow(() -> new EntityNotFoundException(id + " id'si ile kullanıcı bulanamadi"));

  }

  public Customer findCustomerByPhoneNumber(String phoneNumber)
  {
    return customerDao.findByPhoneNumber(phoneNumber).orElseThrow(() -> new EntityNotFoundException(phoneNumber + " telefon numarasıyla kullanıcı bulanamadi"));
  }

  public Customer saveCustomer(Customer customer)
  {
    return customerDao.save(customer);
  }


  public void deleteCustomer(String userName, String phoneNumber){
     Customer customerByUsername = findCustomerByUserName(userName);
     Customer customerByPhoneNumber = findCustomerByPhoneNumber(phoneNumber);

     if(customerByUsername.getId().equals(customerByPhoneNumber.getId())){
       customerDao.deleteById(customerByUsername.getId());
     }else{
       throw new UserNameAndPhoneNumberIsNotMatchException(userName + " kullanıcı adi ile " + phoneNumber + " telefon numarası uyuşmamaktadır");
     }
  }

  public void updateCustomer(Customer customer){
    findCustomerById(customer.getId());
    saveCustomer(customer);
  }


}
