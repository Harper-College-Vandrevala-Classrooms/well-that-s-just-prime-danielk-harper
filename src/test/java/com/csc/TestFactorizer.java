package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFactorizer {

  Factorizer factorizer;

  @BeforeEach
  void setUp() {
    factorizer = new Factorizer();
  }

  // testing factor()
  @Test
  public void testNeg1factor() {
    assertEquals(null, factorizer.factor(-1));
  }
  
  @Test
  public void test0factor() {
    assertEquals(null, factorizer.factor(0));
  }
  
  @Test
  public void test1factor() {
    assertEquals(null, factorizer.factor(1));
  }
  
  @Test
  public void test2factor() {
    assertEquals("2", factorizer.factor(2));
  }
  
  @Test
  public void test4factor() {
    assertEquals("2,2", factorizer.factor(4));
  }
  
  @Test
  public void test18factor() {
    assertEquals("2,3,3", factorizer.factor(18));
  }
  
  // testing isPrime()
  @Test
  public void testNeg1isPrime() {
    assertEquals(false, factorizer.isPrime(-1));
  }
  
  @Test
  public void test1isPrime() {
    assertEquals(false, factorizer.isPrime(1));
  }
  
  @Test
  public void test2isPrime() {
    assertEquals(true, factorizer.isPrime(2));
  }
  
  @Test
  public void test4isPrime() {
    assertEquals(false, factorizer.isPrime(4));
  }
  
  @Test
  public void test17isPrime() {
    assertEquals(true, factorizer.isPrime(17));
  }
}
