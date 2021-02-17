package com.javaclass.inheritance;

public class Cat extends Animal {

    private static void climbTree(){
        System.out.println("Inside cat: Climb Tree");
    }

    private static void climbTree(int noOfTree){
        System.out.println(" noOfTrre climbed "+ noOfTree);
    }

    private int sum(int a, int b){
        return a+b;
    }

    private int sum(int a, int b, int c){
        return  sum(a,b) + c;
    }

    @Override
    public void playSound(){
//        super.playSound();
        System.out.println("Play Sound in Cat");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.climbTree();
        cat.climbTree(5);
        cat.playSound();
        System.out.println(cat.sum(1,2,3));
    }
}
