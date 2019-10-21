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
    double side1;
    double side2;
    
    public baseShape(double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }
    
    public double retPerimeter (){
        double perimeter = 2*side1 + 2*side2;
        return perimeter;
    }
    
    public double retArea (){
        double area = side1*side2;
        return area;
    }
}
