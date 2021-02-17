package com.javaclass.trycatch;

public class MyExceptionHandling {
    public static void main(String[] args) {
        System.out.println("My name is Suraj Regmi");
        try {
            int a = 5;
            int b = 1;
            int c = a/b;
            System.out.println("C "+ c);

            int n = Integer.valueOf("1");
            System.out.println(n);

        }
        catch (ArithmeticException e){
            System.out.println("Exception is caught here!");
        }
        catch (NumberFormatException e){
            System.out.println(" I am in number format exception");
        }
        catch (Exception e){
            System.out.println("I am in exception");
        }
        finally {
            System.out.println(" I am in finally block ");
        }
        System.out.println("I am in the end of the program ");


        int sum = addTwoNumbers(5,6);

        try{
            int sum2 = addTwoNumbers("5", "6","0");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("I am in the last final");

    }

    public static  int addTwoNumbers(int a, int b){
        return a+b;
    }

    public static int addTwoNumbers(String number1, String number2, String scale) throws NumberFormatException, ArithmeticException {
        try{
            int n1 = Integer.valueOf(number1);
            int n2 = Integer.valueOf(number2);
            int scaleint = Integer.valueOf(scale);
            return (n1+ n2)/scaleint;
        }
        catch (NumberFormatException e){
            throw new NumberFormatException("Number is not convertible");
        }
        catch (ArithmeticException e){
            throw new ArithmeticException("Type casting Exception");
        }

    }
}
