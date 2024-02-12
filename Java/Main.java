public class Main{
    public static void main (String[] arg) {
        C1 a = new C1();
        a.m1();
        a.m2();
        a.g1();
    }
}
interface G{
    void g1();
}
interface A1 extends G{
    void m1();
}
interface A2 extends G{
    void m1();
    void m2();
}
class C1 implements A1,A2{
    public void m1(){
        System.out.println("Inside m1");
    }
    public void m2(){
        System.out.println("Inside m2");
    }
    public void g1(){
        System.out.println("Inside G");
    }
}

