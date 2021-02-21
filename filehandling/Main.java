package com.javaclass.filehandling;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        String className = Test.getNameOfClass();
        System.out.println(className);

        Integer a = 5;
        if(a > 10){
            System.out.println("Higher Secondary");
        }else if(a <5){
            System.out.println("Primary");
        }else if( a == null){
            System.out.println("Please give value of Null");
        }

    }
}
