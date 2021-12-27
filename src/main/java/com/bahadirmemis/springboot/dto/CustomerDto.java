package com.bahadirmemis.springboot.dto;

import java.util.UUID;
import lombok.Data;


@Data
public class CustomerDto {

  private UUID id;

  private String name;

  private String lastName;

  private String mail;

  private String phoneNumber;

  private String userName;

}
