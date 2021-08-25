package steps;

import org.testng.annotations.Test;

import java.io.IOException;


public class ExceptionTeste {
    @Test(expectedExceptions = { IOException.class } )
    public void exceptionTestOne() throws  Exception {
        throw  new IOException();
    }
}
