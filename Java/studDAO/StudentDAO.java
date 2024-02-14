package studDAO;

import Config.Config;   // import to make connection  with DB
import Entities.Student;  // import to give schema of Student class

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {
    public static String insert(Student student) throws SQLException{
        Connection conn1 = Config.create();
        String qString = "insert into student (sid,sname,rno,sdept,age)" +
                "values(?, ?, ?, ?, ?)";
        PreparedStatement smt = conn1.prepareStatement(qString);
        smt.setInt(1,student.getSid());
        smt.setString(2,student.getSname());
        smt.setInt(3,student.getRno());
        smt.setString(4,student.getSdept());
        smt.setInt(5,student.getAge());
        smt.executeUpdate();
        return "Student Added";
    }
    public static String update(int sid,String sdept) throws SQLException{
        Connection conn2 = Config.create();
        String qString = "update student set sdept=? where sid=?;";
        PreparedStatement smt = conn2.prepareStatement(qString);
        smt.setString(1,sdept);
        smt.setInt(2,sid);
        smt.executeUpdate();
        return "Student Updated";
    }
    public static String delete(int sid) throws SQLException{
        Connection conn3 = Config.create();
        String qString = "delete from student where sid=?;";
        PreparedStatement smt = conn3.prepareStatement(qString);
        smt.setInt(1,sid);
        smt.executeUpdate();
        return "Student Deleted";
    }
    public static String show() throws SQLException{
        Connection conn4 = Config.create();
        String qString = "select * from student";
        PreparedStatement smt = conn4.prepareStatement(qString);
        ResultSet rs = smt.executeQuery(qString);
        System.out.println("sid" + "\t" + "sname" + "\t" + "rno" +
                "\t" + "sdept" + "\t" + "age");
        while (rs.next()) {
            int sid = rs.getInt("sid");
            String sname = rs.getString("sname");
            int rno = rs.getInt("rno");
            String sdept = rs.getString("sdept");
            int age = rs.getInt("age");
            System.out.println(sid + "\t" + sname + "\t" + rno +
                    "\t" + sdept + "\t" + age);
        }
        return "See";
    }

}