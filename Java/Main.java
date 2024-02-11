public class Main {
    public static void main (String[] arg) {
        Figure a = new Circle();
        Figure b = new Square();
        double areaCirle = a.area(2);
        System.out.println(areaCirle);
        double areaSquare = b.area(2);
        System.out.println(areaSquare);
    }
}
interface Figure{
    double area (int a);
    double parameter(int a);
}
class Circle implements Figure{
    public double area(int a){
        return 3.14*a*a;
    }
    public double parameter(int a){
        return 2*3.14*a;
    }
}
class Square implements Figure{
    public double area(int a){
        return a*a;
    }
    public double parameter(int a){
        return 4*a;
    }
}


