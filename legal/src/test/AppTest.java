package com.legal;
 
public class  App {
    public static void main(String[] args) {
      System.out.println(sum(1,2));
      System.out.println(evaluate("2+3+4"));
    }
    
    
    public static int sum(int a, int b) {
      int sum = a + b;
      return sum;
    }
 
    // Se calculan las expresiones para el test
    public static int evaluate(String expression) {
      int sum = 0;
      for (String summand: expression.split("\\+"))
        sum += Integer.valueOf(summand);
      return sum;
    }
  }