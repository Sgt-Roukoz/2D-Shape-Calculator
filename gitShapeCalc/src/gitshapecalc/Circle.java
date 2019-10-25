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
public class Circle {
    double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public double retPerimeter (){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
    
    public double retArea (){
        double area = Math.PI * radius * radius;
        return area;
    }
}
