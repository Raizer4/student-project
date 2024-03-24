package studentOrder;

import studentOrder.domain.Adult;
import studentOrder.domain.Child;
import studentOrder.domain.StudentOrder;

import java.sql.*;

public class SaveStudentOrder {

    public static void main(String[] args) throws Exception{

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jc_student",
                "postgres","1");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT");
        while (rs.next()){
            System.out.println(rs.getLong(1));
        }

        //StudentOrder so1 = new StudentOrder();
        //saveStudentOrder(so1);

    }

    static long saveStudentOrder(StudentOrder studentOrder){
        long answer = 199;

        System.out.println("saveStudentOrder 1");
        return answer;
    }

    static StudentOrder buildStudentOrder(long id){
        StudentOrder so = new StudentOrder();

       Adult husband = new Adult(null,null,null,null,null);
       Adult wife = new Adult(null,null,null,null,null);
       husband.setPassportSeria(""+ (1000 + id));
       wife.setPassportSeria(""+ (2000 + id));

        so.setHusband(husband);
        so.setWife(wife);
        so.addChild(new Child(null,null,null,null,null));


        return so;
    }

}
