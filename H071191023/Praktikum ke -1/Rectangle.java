import java.util.Scanner;
class Rectangle{
    double height;
    double width;
    double Rectangle;

        public double getHeight(){
            return height;
        }
        public void setHeight(double height){
            this.height = height;
        }
        public double getWidth(){
            return width;
        }
        public void setWidth(double width){
            this.width = width;
    }
    public double getArea(){
       return width*height;
    }
    public double setArea(){
        return width*height;
    }
    public double getKel(){
        return (2*width)+(2*height);
    }
}
    class Main{
        public static void main(String[] args) {
             Scanner s = new Scanner(System.in);
             Rectangle rec =new Rectangle();
             rec.height = s.nextDouble();
             rec.width  = s.nextDouble();
            System.out.println("luas = "+ rec.getArea());
        }
     }
