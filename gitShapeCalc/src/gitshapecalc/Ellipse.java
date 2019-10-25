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
public class Ellipse extends Circle {
    double radius2;
    
    public Ellipse(double radius, double radius2){
        super(radius);
        this.radius = radius;  
        this.radius2 = radius2; 
    }
    
   @Override public double retPerimeter (){ // Override of the two base methods from the superclass
        double perimeter = Math.PI * (3 * (radius + radius2) - Math.sqrt((3 * radius + radius2) * (radius + 3 * radius2)));
        return perimeter;
    }
    
   @Override public double retArea (){
        double area = Math.PI * radius * radius2;
        return area;
    }
}
