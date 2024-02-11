public class Student {
    int rollno;
    String name;
    Student(){
        System.out.println("Hello");
    }
    Student(int rollno){
        this.rollno = rollno;
    }

    Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}
