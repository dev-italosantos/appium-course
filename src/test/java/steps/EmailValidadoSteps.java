package steps;

import org.apache.commons.validator.routines.EmailValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertTrue;

public class EmailValidadoSteps {

    @ParameterizedTest
    @ValueSource(strings = {"mail@mail.com"})
    public void verificaSeEmailEValido(String email) {
        assertTrue(EmailValidator.getInstance().isValid(email));
    }
}
