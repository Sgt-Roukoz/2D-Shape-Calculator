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
public class Square {
    double base;
    
    public Square(double side1){
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
