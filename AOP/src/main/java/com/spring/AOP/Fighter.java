package com.spring.AOP;


public class Fighter {
    @Pointcut("excution(* com.spring.AoP.Tiger.walk())")
    public void founTiger(){

    }
    @Before(value = "foundTiger()")
    public void foundBefore(){
        System.out.println("Fighter wait for tiger...");

    }
    @AfterReturning("foundTiger()")
    public void foundAfter(){
        System.out.println("Fighter fight with tiger...");
    }
}
