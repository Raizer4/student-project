package studentOrder.validator.register;

import studentOrder.domain.Adult;
import studentOrder.domain.Child;
import studentOrder.domain.register.CityRegisterResponse;
import studentOrder.domain.Person;
import studentOrder.exception.CityRegisterException;

public class FakeCityRegisterChecker implements CityRegisterChecker {

    public static final String GOOD_1 = "1000";
    public static final String GOOD_2 = "2000";
    public static final String BAD_1 = "1001";
    public static final String BAD_2 = "2001";
    public static final String ERROR_1 = "1002";
    public static final String ERROR_2 = "2002";

    public CityRegisterResponse checkPerson(Person person)throws CityRegisterException {
        CityRegisterResponse res = new CityRegisterResponse();

        if (person instanceof Adult ){

            Adult t = (Adult) person;
            String ps = t.getPassportSeria();

            if (ps.equals(GOOD_1) || ps.equals(GOOD_2)){
                res.setExisting(true);
                res.setTemporal(false);
            }

            if (ps.equals(BAD_1) || ps.equals(BAD_2)){
                res.setExisting(false);
            }

            if (ps.equals(ERROR_1) || ps.equals(ERROR_2)){
                CityRegisterException ex = new CityRegisterException("FAKE ERROR");
                throw ex;
            }
        }

        if (person instanceof Child){
            res.setExisting(true);
            res.setTemporal(true);
        }


        return res;
    }

}
