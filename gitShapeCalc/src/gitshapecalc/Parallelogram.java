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
public class Parallelogram extends Square{
    double height;
    double diagonal;
    
    public Parallelogram(double base, double height, double diagonal){
        super(base);
        this.base = base;
        this.height = height;
        this.diagonal = diagonal;
    }
    
    @Override public double retPerimeter (){
        double perimeter = 2*base + 2*diagonal;
        return perimeter;
    }
    
    @Override public double retArea (){
        double area = base * height;
        return area;
    }
    
}
