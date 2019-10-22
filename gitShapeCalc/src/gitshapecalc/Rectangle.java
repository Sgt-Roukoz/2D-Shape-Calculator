/*
 * Rectangle class, a child-class of the super-class "Square"
 * Adds another attribute (height) to caculate the area and perimeter
 */
package gitshapecalc;

public class Rectangle extends Square {
    double height;
    
    public Rectangle(double base, double height){
        super(base,height);
        this.base = base;
        this.height = height;  
    }
    
   @Override public double retPerimeter (){ // Override of the two base methods from the superclass
        double perimeter = 2*base + 2*height;
        return perimeter;
    }
    
   @Override public double retArea (){
        double area = base * height;
        return area;
    }
}

