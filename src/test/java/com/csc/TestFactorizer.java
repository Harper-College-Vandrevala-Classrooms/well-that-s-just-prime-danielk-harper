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

  @Test
  public void testNeg1() {
    assertEquals(null, factorizer.factor(-1));
  }
  
  @Test
  public void test0() {
    assertEquals(null, factorizer.factor(0));
  }
  
  @Test
  public void test1() {
    assertEquals(null, factorizer.factor(1));
  }
  
  @Test
  public void test2() {
    assertEquals("2", factorizer.factor(2));
  }
  
  @Test
  public void test4() {
    assertEquals("2,2", factorizer.factor(4));
  }
  
  @Test
  public void test18() {
    assertEquals("2,3,3", factorizer.factor(18));
  }
}
