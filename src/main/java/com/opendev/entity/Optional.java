package com.opendev.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Optional {
  
  private Integer id;

  private String name;
  
  private String fullName;
  
  private Double cost;
  
}
