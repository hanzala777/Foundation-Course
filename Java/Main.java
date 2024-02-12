public class Main{
    public static void main (String[] arg) {
//        A a = new A() {};
//        System.out.println(a.area(4));
//        System.out.println(a.param(5));
        Figure circle = new Circle();
        System.out.println(circle.area(2));
        System.out.println((circle.parameter(4)));
        circle.m();
    }
}
abstract class Figure{
    abstract double area(int a);
    abstract double parameter(int a);
    public void m(){
        System.out.println("Hello");
    }
}
class Circle extends Figure{
    public double area(int a){
        return 3.14*a*a;
    }
    public double parameter(int a){
        return 2*3.14*a;
    }
}
//interface A{
//    default double area(int a){
//        return a*a;
//    }
//    default double param(int a){
//        return 4*a;
//    }
//
//}
