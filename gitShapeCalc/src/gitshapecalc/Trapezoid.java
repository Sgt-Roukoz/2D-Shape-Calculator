/*
 * 
 */

package gitshapecalc;
/**
 * @author Marwan Zeid
 */

public class Trapezoid extends Square {
    double height;
    double base2;
    double side1;
    double side2;
    
    public Trapezoid(double base, double height, double base2, double side1, double side2){
        super(base);
        this.base = base;
        this.height = height;
        this.base2 = base2;
        this.side1 = side1;
        this.side2 = side2;
    }
    
    @Override public double retPerimeter(){
        double perimeter = base + base2 + side1 + side2;
        return perimeter;
    }
    
    @Override public double retArea(){
        double area = height * ((base + base2)/2);
        return area;
    }
}
