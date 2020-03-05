import java.util.*;
 class Box {

    private double width;
    private double height;
    private double depth;
    private double mass;
    private double density;

    public Box (double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDepth(double depth){
        this.depth = depth;
    }

    public void setMass(double mass){
        this.mass = mass;
    }
    public double getDensity(){
        return mass/(width*height*depth);
    }
 
    static class Main {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            double width = in.nextDouble();
            double height = in.nextDouble();
            double depth = in.nextDouble();
            double mass = in.nextDouble();

            Box box = new Box(width, height, depth);
            box.setMass(mass);
            System.out.println("massa jenis = " + box.getDensity());
            box.setMass(mass * 2);
            System.out.println("massa jenis = " + box.getDensity());
        }
    }
}