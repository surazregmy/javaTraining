package com.javaclass.interfacepackage;

public abstract class  Shape {

    public int area;

    abstract public int calculateArea();

    abstract public void setDimension();

    public void printArea(){
        System.out.println(this.area);
    }

}
