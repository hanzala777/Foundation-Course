import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");
        if(Config.create()!=null){
            System.out.println("connected");
        }else System.out.println("not conn");
        Connection con = Config.create();
//        String query = "update student " +
//                "set sdept ='comp' where sdept in ('cse','it');";
        String query = "select * from student;";
//        String query = "insert into student " +
//                "values (5, 'Adil',89,'mech',27);";
//        String query = "update student "+
//                "set age = 20 where sname in ('Hanzala','Umair')";
        PreparedStatement smt = con.prepareStatement(query);
//        smt.executeUpdate();
        ResultSet rs = smt.executeQuery(query);
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
        con.close();
    }
}
