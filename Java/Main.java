public class Main{
    public static void main (String[] arg) {
        Students st1 = new Students();
        st1.setId(2);
        st1.setAge(0);
        st1.setName("Hanzala");
        st1.setMarks(99);
        System.out.println("Id : " + st1.getId());
        System.out.println("Age : " + st1.getAge());
        System.out.println("Name : " + st1.getName()+ " " + st1.getLname());
        System.out.println(st1.isPassed() ? "Pass" : "Fail");
    }
}
class Students{
    private int id, age;
    private String name, lname = "Ahmed";

    private int marks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }
    public boolean isPassed(){
        return marks > 40;
    }


    public void setAge(int age){
        if(age <= 0) {
            System.out.println("enter proper Age");
            this.age = -1;
        } else {
            this.age = age;
        }
    }
    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public String getLname(){
        return this.lname;
    }
}

