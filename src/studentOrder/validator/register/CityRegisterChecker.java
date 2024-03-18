package studentOrder.validator.register;

import studentOrder.domain.CityRegisterCheckerResponse;
import studentOrder.domain.Person;
import studentOrder.exception.CityRegisterException;

public interface CityRegisterChecker {

    CityRegisterCheckerResponse checkPerson(Person person) throws CityRegisterException;

}
