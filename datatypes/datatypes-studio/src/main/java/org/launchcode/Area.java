package org.launchcode;
import javax.net.ssl.SSLContext;
import java.util.*;
public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius:");

        Double radius = input.nextDouble();
        System.out.println("The area is: " + Math.PI * radius * radius);
    }
}
