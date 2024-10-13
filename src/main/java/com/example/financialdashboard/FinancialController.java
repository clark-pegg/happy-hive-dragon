package com.example.financialdashboard.controller;

import java.io.FileReader;
import java.io.FileNotFoundException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

@RestController
public class FinancialController {

  @GetMapping("/balances")
  public String getBalances() {
    try{
      Object object = new JSONParser().parse(new FileReader("balances.json"));

      JSONObject json = (JSONObject) object;

      return json.toString();
    } catch (Exception e) {
      e.printStackTrace();
      return "";
    }
  }
}
