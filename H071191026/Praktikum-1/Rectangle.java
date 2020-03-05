import java.util.Scanner;

class Rectangle {
    double heigh;
    double width;

    double getArea() {
        return heigh * width;
    }

    public static void main(String[] args) {
        Scanner rv = new Scanner(System.in);
        Rectangle rec = new Rectangle();
        rec.heigh = rv.nextDouble();
        rec.width = rv.nextDouble();
        System.out.println("Luas  : " + rec.getArea());

    }
}