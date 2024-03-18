package studentOrder.validator;

import studentOrder.domain.AnswerCityRegister;
import studentOrder.domain.StudentOrder;
import studentOrder.exception.CityRegisterException;
import studentOrder.validator.register.CityRegisterChecker;
import studentOrder.validator.register.RealCityRegisterChecker;

public class CityRegisterValidator {

    String hostName;
    String login;
    String password;

    private CityRegisterChecker personChecker;

    public CityRegisterValidator(){
        personChecker = new RealCityRegisterChecker();
    }

     public AnswerCityRegister checkCityRegister(StudentOrder so){
         try {
             personChecker.checkPerson(so.getChild());
         } catch (CityRegisterException e) {
             e.printStackTrace();
         }
         return new AnswerCityRegister();
    }

}
