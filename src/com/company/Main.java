package com.company;
import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        double xa, ya, xb, yb, xc, yc;
        double AB,AC,BC;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinate x of dot A:");
        xa = sc.nextDouble();
        System.out.println("Enter coordinate y of dot A:");
        ya = sc.nextDouble();
        System.out.println("Enter coordinate x of dot B:");
        xb = sc.nextDouble();
        System.out.println("Enter coordinate y of dot B:");
        yb = sc.nextDouble();
        System.out.println("Enter coordinate x of dot C:");
        xc = sc.nextDouble();
        System.out.println("Enter coordinate y of dot C:");
        yc = sc.nextDouble();

        AB = sqrt(pow(xa - xb, 2)+ pow(ya-yb,2));
        BC = sqrt(pow(xb - xc, 2)+ pow(yb-yc,2));
        AC = sqrt(pow(xa - xc, 2)+ pow(ya-yc,2));

        // Condition check over sides of triangle
        if (AB<0||AC<0||BC<0||(AB + AB <= BC)||(AC+BC<=AB)||(AB+BC<=AC))
        {
            System.out.println("Not a valid input");
            System.exit(0);
        }
        System.out.println("Length of AB is: "+"'"+ AB+"'");
        System.out.println("Length of BC is: "+"'"+ BC+"'");
        System.out.println("Length of AC is: "+"'"+ AC+"'");
        System.out.println();

        //classify side
        if(AB == AC && AC == BC){
            System.out.println("Triangle IS 'Equilateral'");
            System.out.println("Triangle IS 'Isosceles'");
        }else if(AB==BC||AB==AC||BC==AC){
            System.out.println("Triangle IS NOT 'Equilateral'");
            System.out.println("Triangle IS 'Isosceles'");
        }else {
            System.out.println("Triangle IS NOT 'Equilateral'");
            System.out.println("Triangle IS NOT 'Isosceles'");
            System.out.println("Triangle IS 'Scalene'");
        }
        //classify angle
        double delta = 0.3;
        if(AB>AC&&AB>BC){   // when largest side is 'AB'
            if(pow(AB, 2) - (pow(AC, 2) + pow(BC, 2)) <= delta){
                System.out.println("Triangle IS 'Right'");
            }else if(pow(AB,2)< pow(AC,2)+ pow(BC,2)){
                System.out.println("Triangle IS 'Acute'");
            }else {
                System.out.println("Triangle IS 'Obtuse'");
            }
        }else if(BC>AB&&BC>AC) {    // when largest side is 'BC'
            if (pow(BC, 2) - (pow(AB, 2) + pow(AC, 2)) <= delta) {
                System.out.println("Triangle IS 'Right'");
            } else if (pow(BC, 2) < pow(AB, 2) + pow(AC, 2)) {
                System.out.println("Triangle IS 'Acute'");
            } else {
                System.out.println("Triangle IS 'Obtuse'");
            }
        }else if(AC>AB&&AC>BC){     // when largest side is 'AC'
            if(pow(AC, 2) - (pow(AB, 2) + pow(BC, 2)) <= delta){
                System.out.println("Triangle IS 'Right'");
            }else if(pow(AC, 2) < pow(AB, 2) + pow(BC, 2)){
                System.out.println("Triangle IS 'Acute'");
            }else {
                System.out.println("Triangle IS 'Obtuse'");
            }
        }
        System.out.println();
        //perimeter
        double p = AB+BC+AC;
        System.out.println("Perimeter: "+"'"+p+"'");
        System.out.println();

        System.out.println("Parity numbers in range from 0 to triangle perimeter:");
        for (int i = 0; i < p; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
