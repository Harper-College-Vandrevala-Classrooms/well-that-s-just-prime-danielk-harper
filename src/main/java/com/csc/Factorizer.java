package com.csc;

import java.util.*;

public class Factorizer {
  public String factor(int number) {
    if (number <= 1) return null;
    
    String factors = "";
    
    int i = 2;
    // this loop will start at the smallest prime, and keep dividing the number by this prime until the number can't be evenly divided anymore.
    // then, it will go to the next number and keep repeating the process. as every composite number is made up of primes that are lesser in value,
    // we will never divide number by a composite number, skipping every composite, therefore meaning we will only check prime factors.
    while (i <= number) {
      if (number % i == 0) {
        factors = factors + String.format(",%d", i);
        number /= i;
      } else {
        i += 1;
      }
    }
    
    return factors.substring(1);
  }
}
