package Entities;

public class Student {
    int sid,age,rno;
    String sname, sdept;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSdept() {
        return sdept;
    }


    public void setSdept(String sdept) {
        this.sdept = sdept;
    }
    public Student(int sid, String sname, int rno, String sdept,int age) {
        this.sid = sid;
        this.age = age;
        this.rno = rno;
        this.sname = sname;
        this.sdept = sdept;
    }
//    }
}
