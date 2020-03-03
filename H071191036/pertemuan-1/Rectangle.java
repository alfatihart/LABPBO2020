package pertemuan1;

class Rectangle {
    double height;
    double weight;

    double getArea(){
       
        return height*weight;
        
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.height = 15;
        rec.weight = 10;
        System.out.println("luas = "+ rec.getArea());
    }
}