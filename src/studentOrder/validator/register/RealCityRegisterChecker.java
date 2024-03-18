package studentOrder.validator.register;

import studentOrder.domain.CityRegisterCheckerResponse;
import studentOrder.domain.Person;
import studentOrder.exception.CityRegisterException;
import studentOrder.validator.register.CityRegisterChecker;

public class RealCityRegisterChecker implements CityRegisterChecker {

    public CityRegisterCheckerResponse checkPerson(Person person)throws CityRegisterException {
        return null;
    }

}
