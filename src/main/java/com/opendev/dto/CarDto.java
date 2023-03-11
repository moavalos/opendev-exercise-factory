package com.opendev.dto;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CarDto {

  int model;
  
  Set<Integer> optionals;
  
}
