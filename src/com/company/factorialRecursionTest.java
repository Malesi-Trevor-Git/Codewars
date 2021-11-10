package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class factorialRecursionTest {
    factorialRecursion factorial;
    @BeforeEach
    void setUp(){
        factorial=new factorialRecursion();

    }
    @Test
    void returnOne(){
         assertEquals(1,factorial.fact(1));
    }




}