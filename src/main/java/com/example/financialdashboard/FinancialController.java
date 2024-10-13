package com.example.financialdashboard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinancialController {
  
  @GetMapping("/balances")
  public String getBalances() {
    return "{\"balance\": 1500, \"currency\": \"USD\"}";
  }

}
