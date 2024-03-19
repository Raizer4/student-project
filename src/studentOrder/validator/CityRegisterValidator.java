package studentOrder.validator;

import studentOrder.domain.Person;
import studentOrder.domain.register.AnswerCityRegister;
import studentOrder.domain.Child;
import studentOrder.domain.register.AnswerCityRegisterItem;
import studentOrder.domain.register.CityRegisterResponse;
import studentOrder.domain.StudentOrder;
import studentOrder.exception.CityRegisterException;
import studentOrder.validator.register.CityRegisterChecker;
import studentOrder.validator.register.FakeCityRegisterChecker;

public class CityRegisterValidator {

    String hostName;
    String login;
    String password;

    private CityRegisterChecker personChecker;

    public CityRegisterValidator(){
        personChecker = new FakeCityRegisterChecker();
    }

     public AnswerCityRegister checkCityRegister(StudentOrder so){

         AnswerCityRegister ans = new AnswerCityRegister();

         ans.addItem(checkPerson(so.getHusband()));
         ans.addItem(checkPerson(so.getWife()));
         for (Child temp : so.getChildren()) {
             ans.addItem(checkPerson(temp));
         }

         return ans;
    }

    private AnswerCityRegisterItem checkPerson(Person person){

        try {
            CityRegisterResponse cans = personChecker.checkPerson(person);
        } catch (CityRegisterException e) {
            e.printStackTrace(System.out);
        }

        return null;
    }

}
