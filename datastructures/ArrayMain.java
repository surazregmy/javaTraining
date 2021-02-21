package com.javaclass.datastructures;


import com.javaclass.inheritance.School;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayMain {

    public static void main(String[] args) {
//        School[] arrayOfSchool = new School[2] ;
        List<School> arrayOfSchool_list = new ArrayList<>();
//
        School school1 = new School("Janata","CTWB");
        School school2 = new School("Xavier","KTM");
//        arrayOfSchool[0] = school1;
//        arrayOfSchool[2]= school2;
        arrayOfSchool_list.add(school1);
        arrayOfSchool_list.add(school2);

        HashMap myHashMap  = new HashMap();

        myHashMap.put(1,"Suraj");
        myHashMap.put(2,"Sandeep");
        myHashMap.put(3,"Sushant");
        myHashMap.put(4,arrayOfSchool_list);
//        System.out.println(myHashMap.get(1));


//        System.out.println(myHashMap.keySet());

        for (Object i : myHashMap.keySet()){

            if(myHashMap.get(i) instanceof String){
                System.out.println(myHashMap.get(i));
            }else if(myHashMap.get(i) instanceof ArrayList){
                System.out.println(myHashMap.get(i));
                List<School> retrievedArrayList = (List<School>) myHashMap.get(i);
                for (School school: retrievedArrayList){
                    System.out.println(school.getSchoolName());
                }

            }

        }








//        int a = 1;
//        int[] arrayOfIntegers = {10,20,20,30};
//        int[][] multiDimensionalArrays = {{10,20,30},{40,50,60}};

//        for(int i : arrayOfIntegers){
//            System.out.println(i);
//        }
//        for(int n= 0; n < arrayOfIntegers.length; n++){
//            System.out.println(arrayOfIntegers[n]);
//        }
//        System.out.println(multiDimensionalArrays[0][2]);
//        String[] cars = {"Toyota","Ferari","Honda"};
//        for(String i : cars){
//            System.out.println(i);
//        }
//        for(int i =0; i <2 ; ++i){
//            for(int j = 0;  j < 3; ++j){
//                    System.out.print(multiDimensionalArrays[i][j] + "  ");
//            }
//            System.out.println();
//
//        }




    }
}
