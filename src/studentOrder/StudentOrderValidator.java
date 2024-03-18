package studentOrder;

import studentOrder.domain.*;
import studentOrder.mail.MailSender;
import studentOrder.validator.ChildrenValidator;
import studentOrder.validator.CityRegisterValidator;
import studentOrder.validator.StudentValidator;
import studentOrder.validator.WeddingValidator;

public class StudentOrderValidator {

    private CityRegisterValidator cityRegisterVal;
    private WeddingValidator weddingVal;
    private ChildrenValidator childrenVal;
    private StudentValidator studentVal;
    private MailSender mailSender;

    public StudentOrderValidator(){
        cityRegisterVal = new CityRegisterValidator();
        weddingVal = new WeddingValidator();
        childrenVal = new ChildrenValidator();
        studentVal = new StudentValidator();
        mailSender = new MailSender();
    }

    public static void main(String[] args) {
        StudentOrderValidator studentOrderValidator = new StudentOrderValidator();
        studentOrderValidator.checkAll();
    }

     void checkAll(){
         StudentOrder[] so = readStudentOrders();

         for (int i = 0; i < so.length; i++){
             checkOneOrder(so[i]);
         }

    }

    public void checkOneOrder(StudentOrder so){

        AnswerCityRegister cityRegister = checkCityRegister(so);
        AnswerChildren childAnswer = checkChildren(so);
        AnswerStudent studentAnswer = checkStudent(so);
        AnswerWedding wedAnswer = checkWedding(so);
        sendMail(so);
    }

    public static StudentOrder[] readStudentOrders(){
        StudentOrder[] soArray = new StudentOrder[3];

        for (int c = 0; c < soArray.length;c++){
            soArray[c] = SaveStudentOrder.buildStudentOrder(c);
        }

        return soArray;
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so){
        return cityRegisterVal.checkCityRegister(so);
    }

    public AnswerWedding checkWedding(StudentOrder so){
        return weddingVal.checkWedding(so);
    }

    public AnswerChildren checkChildren(StudentOrder so){
        return childrenVal.checkChildren(so);
    }

    public AnswerStudent checkStudent(StudentOrder so){
        return studentVal.checkStudent(so);
    }

    public void sendMail(StudentOrder so){
        mailSender.sendMail(so);
    }

}