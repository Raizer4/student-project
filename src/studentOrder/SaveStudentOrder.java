package studentOrder;

import studentOrder.domain.Adult;
import studentOrder.domain.StudentOrder;

public class SaveStudentOrder {

    public static void main(String[] args) {

        StudentOrder so1 = new StudentOrder();
        saveStudentOrder(so1);

    }

    static long saveStudentOrder(StudentOrder studentOrder){
        long answer = 199;

        System.out.println("saveStudentOrder 1");
        return answer;
    }

    static StudentOrder buildStudentOrder(long id){
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);


        return so;
    }

}
