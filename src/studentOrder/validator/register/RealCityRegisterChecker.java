package studentOrder.validator.register;

import studentOrder.domain.register.CityRegisterResponse;
import studentOrder.domain.Person;
import studentOrder.exception.CityRegisterException;

public class RealCityRegisterChecker implements CityRegisterChecker {

    public CityRegisterResponse checkPerson(Person person)throws CityRegisterException {
        return null;
    }

}
