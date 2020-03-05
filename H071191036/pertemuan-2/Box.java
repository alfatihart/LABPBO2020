package pertemuan2;

import java.util.Scanner;
public class Box { 
    private double width;
    private double height;
    private double depth;
    private double mass;
    private double density;

    public Box(double width,double height,double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.mass = mass;

    }

    public void setMass(double mass){
        this.mass = mass;
    }
    public void setDensity(double density){
        this.density = density;
    }

    public double getDensity(){
        return mass/(width*height*depth);
    }


}



 class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        double depth = sc.nextDouble();
        double mass = sc.nextDouble();
        Box box = new Box(width,height,depth);
        box.setMass(mass);
        System.out.println("massa jenis = " + box.getDensity());
        box.setMass(mass*2);
        System.out.println("massa jenis = "+ box.getDensity());
    }
}