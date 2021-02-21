package com.javaclass.inheritance;

import java.util.ArrayList;
import java.util.List;

public class School {
    String schoolName;
    String address;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public School() {
    }

    public  School(String schoolName, String address) {
        this.schoolName = schoolName;
        this.address = address;
    }

    public static void main(String[] args) {

        List<School> schoolArray = new ArrayList<>();

        School school1 = new School("Samata","KTM");
        schoolArray.add(school1);

        School school2 = new School("Greenland","CHTWN");
        schoolArray.add(school2);

        School school3 = new School("Rato Bangla","KTM");
        schoolArray.add(school3);

        printSchoolList(schoolArray);

    }

    private static void printSchoolList(List<School> schoolArray) {
        int i = 1;
        for(School school: schoolArray){
            System.out.println("School No: "+ i);
            System.out.println("School Name "+ school.schoolName);
            System.out.println("Address "+ school.address);
            i++;

        }
    }
}
