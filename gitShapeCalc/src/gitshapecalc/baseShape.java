/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitshapecalc;

/**
 *
 * @author S347096083
 */
public class baseShape {
    double base;
    
    public baseShape(double side1, double side2){
        this.base = side1;
    }
    
    public double retPerimeter (){
        double perimeter = 4*base;
        return perimeter;
    }
    
    public double retArea (){
        double area = base * base;
        return area;
    }
}

class Rectangle extends baseShape {
    double height;
    
    public Rectangle(double base, double height){
        super(base,height);
        this.base = base;
        this.height = height;
        
    }
}
