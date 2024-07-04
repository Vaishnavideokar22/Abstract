abstract class Method{
    abstract void GetArea();
    abstract void GetPerimeter();
}
class Square extends Method{
    double side;
    double perimeter;
    double area;

    Square(double Side){
        this.side = Side;
}
void GetArea(){
    area = side*side;
    System.out.println("The Area Of Square: " + area);
}
void GetPerimeter(){
    perimeter = 4*side;
    System.out.println("The Perimeter Of Square :" + perimeter);
}
}
class Triangle extends Method{
    double base;
    double height;
    double area;
    double perimeter;
    double side1;
    double side2;
    double side3;

    Triangle(double Base,double Height,double Side1,double Side2,double Side3){
        this.base = Base;
        this.height = Height;
        this.side1 = Side1;
        this.side2 = Side2;
        this.side3 = Side3;
    }
    void GetArea(){
        area = 0.5*base*height;
        System.out.println("The Area Of Triangle is:" +area);
    }
    void GetPerimeter(){
        perimeter = side1*side2*side3;
        System.out.println("The Perimeter Of perimeter: " + perimeter);
    }
}

public class Abstract {

    public static void main(String[] args) {
        
        Square s1 = new Square(32);
        s1.GetArea();
        s1.GetPerimeter();

        Triangle t1 = new Triangle(77, 78, 28, 23, 90);
        t1.GetArea();
        t1.GetPerimeter();
    }
    
}
