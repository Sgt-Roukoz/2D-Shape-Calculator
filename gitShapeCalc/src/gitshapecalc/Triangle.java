/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitshapecalc;
/**
 *
 * @author S347391269
 */
public class Triangle extends Square{
    double height;
    double side1;
    double side2;
    
    public Triangle (double base, double height, double side1, double side2){
        super(base);
        this.base = base;
        this.height = height;  
        this.side1 = side1;
        this.side2 = side2;
    }
    
   @Override public double retPerimeter (){ // Override of the two base methods from the superclass
        double perimeter = base + side1 + side2;
        return perimeter;
    }
    
   @Override public double retArea (){
        double area = base * height * 0.5;
        return area;
    }
    
    
    
}
