package com.example.financialdashboard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinancialController {

  // DUMMY METHOD
  // Currently reads from "balances.json", would need to be changed
  // to read from an actual database

  @GetMapping("/balances")
  public String getBalances() {
    return FinancialControllerHelper.getBalanceFromFile();
  }
}
