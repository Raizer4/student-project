package studentOrder.validator;

import studentOrder.domain.AnswerStudent;
import studentOrder.domain.StudentOrder;

public class StudentValidator {

     public AnswerStudent checkStudent(StudentOrder so){
        System.out.println("Student Check is running");
        return new AnswerStudent();
    }

}
