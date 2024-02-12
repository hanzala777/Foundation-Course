import Pack.*;
public class Main{
    public static void main (String[] arg) {
        int a = 7;
        int b = 1;
        index.a = 9;
        int[] arr = new int[5];
        String name = "Hanzala";
        try{
            throw new MyException();
//            int div = a / b;
//            System.out.println(div);
//            System.out.println(arr[4]);
//            System.out.println(name.toLowerCase());
//            m1();
        } catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception ");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("CLOSE");
        }
        System.out.println("executed");
    }
    public static void m1() throws Exception{
        System.out.println("inside m1");
        throw new Exception("exc");
    }
}
