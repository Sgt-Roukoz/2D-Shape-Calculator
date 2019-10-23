/*
 */

package gitshapecalc;
import java.lang.*;

/*
 * @author Marwan Zeid
 */
public class NPolygon extends Square{
    double sides;
    
    public NPolygon(double base, double sides){
        super(base);
        this.base = base;
        this.sides = sides;
    }
    
    @Override public double retPerimeter(){
        double perimeter = sides * base;
        return perimeter;
    }
    
    @Override public double retArea(){
        double centerLen = base/(2*Math.tan(180/sides)); //Calculate length from center to edge
        double area = 2*((sides*base)*centerLen); // calculate area (assumes regular polygon)
        return area;
    }
}
