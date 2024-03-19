package studentOrder.validator.register;

import studentOrder.domain.register.CityRegisterResponse;
import studentOrder.domain.Person;
import studentOrder.exception.CityRegisterException;

public interface CityRegisterChecker {

    CityRegisterResponse checkPerson(Person person) throws CityRegisterException;

}
