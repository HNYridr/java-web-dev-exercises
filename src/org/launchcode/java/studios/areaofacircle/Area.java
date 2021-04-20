package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter a Radius Value:");
        double userInputNumber = userInput.nextDouble();
        double finalArea = Circle.findArea(userInputNumber);
        userInput.close();
        System.out.println("The area of a circle of radius"+ userInputNumber +"is: "+ finalArea);
    }

}
