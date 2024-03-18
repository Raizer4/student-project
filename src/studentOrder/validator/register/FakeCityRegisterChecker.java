package studentOrder.validator.register;

import studentOrder.domain.Adult;
import studentOrder.domain.CityRegisterCheckerResponse;
import studentOrder.domain.Person;
import studentOrder.exception.CityRegisterException;
import studentOrder.validator.register.CityRegisterChecker;

public class FakeCityRegisterChecker implements CityRegisterChecker {

    public static final String GOOD_1 = "1000";
    public static final String GOOD_2 = "2000";
    public static final String BAD_1 = "1001";
    public static final String BAD_2 = "2001";
    public static final String ERROR_1 = "1001";
    public static final String ERROR_2 = "2001";

    public CityRegisterCheckerResponse checkPerson(Person person)throws CityRegisterException {
        CityRegisterCheckerResponse res = new CityRegisterCheckerResponse();
        if (person instanceof Adult ){

            Adult t = (Adult) person;

            if (t.getPassportSeria().equals(GOOD_1) || t.getPassportSeria().equals(GOOD_2)){
                res.setExisting(true);
                res.setExisting(false);
            }

            if (t.getPassportSeria().equals(BAD_1) || t.getPassportSeria().equals(BAD_2)){
                res.setExisting(false);
            }

            if (t.getPassportSeria().equals(ERROR_1) || t.getPassportSeria().equals(ERROR_2)){
                CityRegisterException ex = new CityRegisterException();
                throw ex;
            }

        }

        return res;
    }

}
