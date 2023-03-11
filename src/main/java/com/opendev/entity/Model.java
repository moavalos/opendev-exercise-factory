package com.opendev.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Model {
  
  private Integer id;
  
  private String name;
  
  private Double cost;
  
}
