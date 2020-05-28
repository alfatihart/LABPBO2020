import java.util.Scanner;
class rectangle {
    double heigh ;
    double width ;
    double getArea (){
        return heigh *width ;
    }
public static void main(String[] args) {
    Scanner rv = new Scanner(System.in);
    rectangle rec = new rectangle();
    rec.heigh = rv.nextDouble();
    rec.width = rv.nextDouble();
    System.out.println("Luas  : " + rec.getArea());
    
    }
}