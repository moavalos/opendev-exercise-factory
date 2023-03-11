package com.opendev.contracts;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StatsOptional {
  
  String optional;
  
  int count;
  
  double percent;
  
}
