/*
 * @author Arnab Kumar Hoodati
 * 
 * Construtor
 */

import java.util.Scanner; 

public class Circle {
        float radius;  
        float pi=3.5f;
public Circle(){ 
    radius=1.5f;
 }
 public Circle(float radius) { 
    this.radius=radius;
 }
public Circle(float radius, float pi){
    this.radius=radius;
    this.pi=3.5f;
 }
 public float calculateArea(float radius) { 
    return pi*radius*radius;
}
 public float calculateCircumference(float radius) { 
        return 2*pi*radius;
 }
 public static void main(String[] args) {
    Circle obj = new Circle();      //creating object of Circle class
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of radius:");
    float Radius = sc.nextFloat();
    sc.close();
    System.out.println("Area is:"+obj.calculateArea(Radius));
    System.out.println("Circumference is: "+obj.calculateCircumference (Radius));
 }
}