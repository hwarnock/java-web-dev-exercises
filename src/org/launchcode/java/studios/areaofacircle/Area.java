package org.launchcode.java.studios.areaofacircle;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner scanVar = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radInput = scanVar.nextDouble();
        double area = Circle.getArea(radInput);
        System.out.println("The area of your circle is " + area);
    }
}

