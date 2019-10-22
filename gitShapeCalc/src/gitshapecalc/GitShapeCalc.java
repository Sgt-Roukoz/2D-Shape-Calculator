/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitshapecalc;

import java.util.Scanner;

/**
 *
 * @author S347096083
 */
public class GitShapeCalc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What type of shape is this?\n(Enter: Triangle, Square, Rectangle, Parallelogram, Circle, Ellipse, or Trapezoid)");
        String shape = sc.nextLine();
        switch(shape){
            case "Triangle":
                baseShape tri = new baseShape(2,7);
                break;
            default:
                System.out.println("This shape was not an option");
                break;
    }
  }
}

