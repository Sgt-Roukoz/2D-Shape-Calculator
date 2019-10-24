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
public class Rhombus extends Square {
    double diagonal1;
    double diagonal2;
    
    public Rhombus (double base, double diagonal1, double diagonal2){
        super(base);
        this.base = base;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }
    
   @Override public double retArea (){
        double area = diagonal1 * diagonal2;
        return area;
    }
}
