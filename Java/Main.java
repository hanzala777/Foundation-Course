import java.sql.SQLException;
import java.util.Scanner;

import Entities.Student;
import studDAO.StudentDAO;


public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("1)insert \n2)delete \n3)show \n4)Show All");
        int choose = sc.nextInt();
        int id;
        switch(choose){
            case 1:
                id = sc.nextInt();
                String name = sc.next();
                int rno = sc.nextInt();
                String dept = sc.next();
                int age = sc.nextInt();
                Student st = new Student(id,name,rno,dept,age);
                StudentDAO.insert(st);
                System.out.println("Data added ");
                break;
            case 2:
                id = sc.nextInt();
                StudentDAO.delete(id);
                System.out.println("Deleted Successfully");
                break;
            case 3:
                id = sc.nextInt();
                StudentDAO.show(id);
                break;
            case 4:
                StudentDAO.showAll();
                break;
        }
    }
}