package ex_25_OOPs_Abstraction_Interface;

public class Lab198_Interface {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        r1.getArea(5,5);

        Square s1= new Square();
        s1.getArea(3, 5);
    }

}

interface Polygon{

    void getArea(int length, int breadth);
}

class Rectangle implements Polygon{

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("The area of rectangle is "+(length * breadth));
    }
}

class Square implements Polygon{

    @Override
    public void getArea(int length, int breadth) {
        System.out.println(3.14 * length * breadth );
    }
}
