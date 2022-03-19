package com.java.bridgelabs.maximum;

import java.util.Scanner;

public class FindMaximum<E extends Comparable<E>>
{
    public static int MAX;
    public static float MAX1;
    public static String MAX2;

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Java Generic Programs");
        System.out.println("Enter a option:"+"\n"+"1.Integer Number"+
                "\n"+"2.Float Number"+"\n"+"3.String");
        int option=scanner.nextInt();
        FindMaximum findMaximum = new FindMaximum();

        switch (option)
        {
            case 1:
                FindMaximum.testMaximumIntegerNumber();
                System.out.println("maximum integer number:"+MAX);
                break;
            case 2:
                FindMaximum.testMaximumFloatNumber();
                System.out.println("maximum float number:"+MAX1);
                break;
            case 3:
                FindMaximum.testMaximumString();
                System.out.println("maximum string:"+MAX2);
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    public static int testMaximumIntegerNumber() {
        Scanner scanner=new Scanner(System.in);
        Test<Integer> number = new Test<Integer>();
        System.out.println("Enter a first integer number:");
        number.setNumber1((scanner.nextInt()));
        System.out.println("Enter a second integer number:");
        number.setNumber2((scanner.nextInt()));
        System.out.println("Enter a third integer number:");
        number.setNumber3((scanner.nextInt()));
        MAX = number.getNumber1();
        if(number.getNumber2().compareTo(MAX)>0) {
            MAX = number.getNumber2();
        }
        if(number.getNumber3().compareTo(MAX)>0) {
            MAX = number.getNumber3();
        }
        return MAX;
    }

    public static Float testMaximumFloatNumber() {
        Scanner sc=new Scanner(System.in);
        Test<Float> number=new Test<Float>();
        System.out.println("Enter a first float number:");
        number.setNumber1((sc.nextFloat()));
        System.out.println("Enter a second float number:");
        number.setNumber2((sc.nextFloat()));
        System.out.println("Enter a third float number:");
        number.setNumber3((sc.nextFloat()));
        MAX1 = number.getNumber1();
        if(number.getNumber2().compareTo(MAX1)>0) {
            MAX1 = number.getNumber2();
        }
        if(number.getNumber3().compareTo(MAX1)>0) {
            MAX1 = number.getNumber3();
        }
        return MAX1;
    }

    public static String testMaximumString() {
        Scanner sc=new Scanner(System.in);
        Test<String> number=new Test<String>();
        System.out.println("Enter a first String:");
        number.setNumber1((sc.next()));
        System.out.println("Enter a second String:");
        number.setNumber2((sc.next()));
        System.out.println("Enter a third String:");
        number.setNumber3((sc.next()));
        MAX2=number.getNumber1();
        if(number.getNumber2().compareTo(MAX2)>0) {
            MAX2=number.getNumber2();
        }
        if(number.getNumber3().compareTo(MAX2)>0) {
            MAX2=number.getNumber3();
        }
        return MAX2;
    }
}




