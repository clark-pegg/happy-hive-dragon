package com.example.financialdashboard.controller;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinancialController {

  // DUMMY METHOD
  // Currently reads from "balances.json", would need to be changed
  // to read from an actual database in later iterations

  @GetMapping("/balances")
  public String getBalances() {
    try{
      return IOUtils.toString(getClass().getClassLoader().getResourceAsStream("balances.json"));
    } catch (IOException e) {
      System.out.println("Could need read file containing balances");
      e.printStackTrace(System.out);
      return "{}";
    }
  }
  
}
