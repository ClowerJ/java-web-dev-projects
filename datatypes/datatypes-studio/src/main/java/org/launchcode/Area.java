package org.launchcode;
import com.sun.source.tree.WhileLoopTree;

import javax.net.ssl.SSLContext;
import java.util.*;
public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");

        if (input.hasNextDouble()){
            Double radius = input.nextDouble();
            while (radius < 0) {
                System.out.println("Radius cannot be negative.");
                System.out.println("Enter a radius:");
                radius = input.nextDouble();
            }
            System.out.println("The area is: " + Circle.getArea(radius));

        }
         else {
            System.out.println("Must be a number.");
        }

        input.close();
    }
}
