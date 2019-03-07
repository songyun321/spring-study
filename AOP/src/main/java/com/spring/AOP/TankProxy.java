package com.spring.AOP;
//代理类

public class TankProxy implements Move {
    private Move t;
    public  TankProxy(Move t){
        this.t = t;


    }
    @Override
    public void move(){
        System.out.println("start");
        t.move();
        System.out.println("stop");
    }
}
