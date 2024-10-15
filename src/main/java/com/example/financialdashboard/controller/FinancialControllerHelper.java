package com.example.financialdashboard.controller;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class FinancialControllerHelper {
  public static String getBalanceFromFile(){
    try{
      Object object = new JSONParser().parse(new FileReader("balances.json"));

      JSONObject json = (JSONObject) object;

      return json.toString();
    } catch (Exception e) {
      return "";
    }
  }
}